package com.bootdo.system.service.impl;

import com.bootdo.system.dao.BaseDAO;
import com.bootdo.system.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Service
public class BaseServiceImpl implements BaseService {
    @Autowired
    private BaseDAO baseDAO;

    @Override
    public <T extends Serializable> T get(Serializable id) {
        return baseDAO.get(id);
    }

    @Override
    public <T extends Serializable> List<T> list(Map<String, Object> map) {
        return baseDAO.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return baseDAO.count(map);
    }

    @Override
    public <T extends Serializable> int save(T pojo) {
        return baseDAO.save(pojo);
    }

    @Override
    public <T extends Serializable> int update(T pojo) {
        return baseDAO.update(pojo);
    }

    @Override
    public <T extends Serializable> int remove(Class<T> clazz, Serializable id) {
        return baseDAO.remove(clazz,id);
    }

    @Override
    public <ID extends Serializable> int batchRemove(List<ID> list) {
        return baseDAO.batchRemove(list);
    }
}
