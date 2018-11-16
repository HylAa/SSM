package com.bootdo.smoke.service;

import com.bootdo.smoke.domain.SmokeDO;

import java.util.List;
import java.util.Map;

/**
 *创建人：（aliang） 阿良
 *
 * smg：和dao层一样的方法
 *
 */
public interface SmokeService {
    //复制粘贴搞定
    SmokeDO get(Long id);
    List<SmokeDO> list(Map<String,Object> map);
    int count(Map<String,Object> map);
    int save(SmokeDO smoke);
    int update(SmokeDO smoke);
    int remove(Long id);
    int batchRemove(Long[] ids);

}
