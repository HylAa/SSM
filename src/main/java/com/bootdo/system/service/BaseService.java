package com.bootdo.system.service;

import com.bootdo.supplier.domain.SupplierDO;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseService {

    public <T extends Serializable > T get(Serializable id);

    public  <T extends Serializable> List<T>list(Map<String, Object> map);

    int count(Map<String, Object> map);

    public <T extends Serializable> int save(T pojo);

    public <T extends Serializable> int update(T pojo);

    public <T extends Serializable> int remove(Class<T> clazz,Serializable id);

    public <ID extends Serializable>  int batchRemove(@Param("ids") List<ID> list);
}
