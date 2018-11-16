package com.bootdo.smoke.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.smoke.domain.SmokeDO;
import org.springframework.ui.Model;
import com.bootdo.smoke.service.SmokeService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 创建人：（aliang）阿良
 *
 * smg：最终boos——嘻嘻；
 */
//不哔哔了 和H 一样的写法..
@Controller
@RequestMapping("/smoke/smoke")
public class SmokeController {
    @Autowired
    private SmokeService smokeService;

    //研究了一下 看不太明白 大致意思是一个权限声明,通常是使用以冒号分隔的表达式。
    @GetMapping()
    @RequiresPermissions("smoke:smoke:smoke")
    String smoke(){
        return "smoke/smoke/smoke";
    }

    //查询（不哔哔了）
    @ResponseBody
    @GetMapping("/list")
    //一样的 权限声明
    @RequiresPermissions("smoke:smoke:smoke")
    //应该是分页的工具类,具体明天看工具类吧！
    public PageUtils list(@RequestParam Map<String, Object> params){
        //查询列表数据，分页工具
        Query query = new Query(params);
        List<SmokeDO> smokeList = smokeService.list(query);
        int total = smokeService.count(query);
        PageUtils pageUtils = new PageUtils(smokeList, total);
        return pageUtils;
    }

    //添加
    @GetMapping("/add")
    @RequiresPermissions("smoke:smoke:add")
    String add(){
        return "smoke/smoke/add";
    }

    //编辑（id）
    @GetMapping("/edit/{id}")
    @RequiresPermissions("smoke:smoke:edit")
    String edit(@PathVariable("id") Long id, Model model){
        SmokeDO smoke = smokeService.get(id);
        model.addAttribute("smoke", smoke);
        return "smoke/smoke/edit";
    }

    /**
     * 保存
     */
    @ResponseBody
    @PostMapping("/save")
    @RequiresPermissions("smoke:smoke:add")
    //封装了个R 也行了！
    public R save(SmokeDO smoke){
        if (smokeService.save(smoke)>0){
            return  R.ok();
        }
        return R.error();
    }


    /**
     * 修改
     */
    @ResponseBody
    @RequestMapping("/update")
    @RequiresPermissions("smoke:smoke:edit")
    public  R update(SmokeDO smoke){
        smokeService.update(smoke)  ;
        return R.ok();
    }


    /**
     * 删除
     */

    @PostMapping("/remove")
    @ResponseBody
    @RequiresPermissions("smoke:smoke:remove")
    public R remove(Long id){
        if (smokeService.remove(id)>0){
            return R.ok();
        }
        return R.error();
    }


    /**
     * 批量删除吧！干就完了!
     */
    @PostMapping( "/batchRemove")
    @ResponseBody
    @RequiresPermissions("smoke:smoke:batchRemove")
    public R remove(@RequestParam("ids[]") Long[] ids){
        smokeService.batchRemove(ids);
        return R.ok();
    }

    //msg:完活

}
