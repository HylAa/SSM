package com.bootdo.smoke.service.impl;

import com.bootdo.smoke.dao.SmokeDao;
import com.bootdo.smoke.domain.SmokeDO;
import com.bootdo.smoke.service.SmokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 创建人：(aliang)阿良
 *
 * smg：实现Service
 *
 */
//和H框架基本类似
    //注解好哈，真省事！
@Service
public class SmokeServiceImpl implements SmokeService {
    //自动装配
    @Autowired
    private SmokeDao smokeDao;

    @Override
    public SmokeDO get(Long id){
        return smokeDao.get(id);
    }

    @Override
    public List<SmokeDO> list(Map<String, Object> map){
        return smokeDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map){
        return smokeDao.count(map);
    }

    @Override
    public int save(SmokeDO smoke){
        return smokeDao.save(smoke);
    }

    @Override
    public int update(SmokeDO smoke){
        return smokeDao.update(smoke);
    }

    @Override
    public int remove(Long id){
        return smokeDao.remove(id);
    }

    @Override
    public int batchRemove(Long[] ids){
        return smokeDao.batchRemove(ids);
    }
}
