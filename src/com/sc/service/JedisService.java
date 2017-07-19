package com.sc.service;

import java.util.List;
import java.util.Set;

public interface JedisService {

	public boolean set(final byte[] key, final byte[] value, final long activeTime);
	public byte[] get(final String key);
	public boolean exists(final String key);
	public long delete(final List<String> keys) ;
	public long delete(final String... keys);
	public boolean flushDB();
	public Set<byte[]> matchKeys(String pattern);
}
