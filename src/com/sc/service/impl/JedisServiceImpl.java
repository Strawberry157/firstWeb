package com.sc.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import com.sc.service.JedisService;

@Service
public class JedisServiceImpl implements JedisService {

	private RedisTemplate<String, Serializable> jedisTemplate;
	//全球小程序redis库
	int dbID=1;
	
	public boolean set(final byte[] key, final byte[] value, final long activeTime) {
		return jedisTemplate.execute(new RedisCallback<Boolean>() { 
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				connection.select(dbID);
				boolean rs = true;
				connection.set(key, value);
				if (activeTime > 0) { 
					rs = connection.expire(key, activeTime);
				} 
				return rs;
			} 
		}); 
	}
	
	public byte[] get(final String key) {
		return jedisTemplate.execute(new RedisCallback<byte[]>() { 
			public byte[] doInRedis(RedisConnection connection) throws DataAccessException { 
				connection.select(dbID);
				byte[] value = connection.get(key.getBytes());
				return value; 
			}
		});
	}
	
	public boolean exists(final String key) { 
		return jedisTemplate.execute(new RedisCallback<Boolean>() { 
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				connection.select(dbID);
				return connection.exists(key.getBytes());
			} 
		});
	}
	
	public long delete(final List<String> keys) { 
		return jedisTemplate.execute(new RedisCallback<Long>() { 
			public Long doInRedis(RedisConnection connection) throws DataAccessException { 
				connection.select(dbID);
				long result = 0; 
				for (String key : keys) { 
					result = connection.del(key.getBytes());
				} 
				return result; 
			} 
		});
	}
	
	public long delete(final String... keys) {
		List<String> cols = new ArrayList<String>(); 
		for (String key : keys) { 
			cols.add(key); 
		} 
		return this.delete(cols);
	} 
	
	public boolean flushDB(){
		return jedisTemplate.execute(new RedisCallback<Boolean>() {
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				connection.select(dbID);
				connection.flushDb();
				return true; 
			} 
		});
	}

	public Set<byte[]> matchKeys(final String pattern) {
		return jedisTemplate.execute(new RedisCallback<Set<byte[]>>() { 
			public Set<byte[]> doInRedis(RedisConnection connection) throws DataAccessException { 
				connection.select(dbID);
				return connection.keys(pattern.getBytes());
			} 
		});
	}

	public RedisTemplate<String, Serializable> getJedisTemplate() {
		return jedisTemplate;
	}

	public void setJedisTemplate(RedisTemplate<String, Serializable> jedisTemplate) {
		this.jedisTemplate = jedisTemplate;
	} 
}
