package com.sc.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import com.sc.entity.Manager;;

public interface ManagerDao {

	@Select("select * from t_manager where name=#{name} and isLock=0")
	@ResultMap("userMap")
	public Manager getByName(String name);

	public void addUser(Manager m);

	public Manager findById(Integer id);

	public List<Manager> findByPage(@Param("begin")Integer begin, @Param("size")Integer size);

	public int  findRows();

	public void update(Manager m);
}
