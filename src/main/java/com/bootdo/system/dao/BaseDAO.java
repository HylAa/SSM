package com.bootdo.system.dao;

import com.bootdo.system.domain.DeptDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Mapper
public interface BaseDAO {
    public <T extends Serializable >T get(Serializable id);

    public <T extends Serializable> List<T> list(Map<String,Object> map);

    int count(Map<String,Object> map);

    public <T extends Serializable> int save(T popj);

    public <T extends Serializable> int update(T pojo);

    public <T extends Serializable> int remove(Class<T> clazz,Serializable id);

    public <ID extends Serializable>  int batchRemove(@Param("ids") List<ID> list);



}
