package com.bootdo.smoke.dao;


import com.bootdo.smoke.domain.SmokeDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/***
 *创建人：（ahliang）阿良
 *
 */

//交给mybatis处理 （我的理解.可能不是‘_’嘻嘻）
@Mapper
public interface SmokeDao {
    //public abstract
    //到了这一步就确定下来跟mybatis有关系了————嘻嘻
    SmokeDO get(Long id);
    //导包哟~~  list and map
    List<SmokeDO> list(Map<String,Object> map);
    //count翻译的意思是计数 就是查询————.
    int count(Map<String,Object> map);
    //保存。。。。。
    int save(SmokeDO smoke);
    //编辑 更新 。。。。
    int update(SmokeDO smoke);
    //移除 where（id）。。
    int remove(Long id);
    //批量移除 whert（[] ids）
    int batchRemove(Long[] ids);

    //ok dao层编写结束
}
