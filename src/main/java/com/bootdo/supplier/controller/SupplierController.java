package com.bootdo.supplier.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.supplier.domain.SupplierDO;
import com.bootdo.supplier.service.SupplierService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-11-16 10:18:05
 */
 
@Controller
@RequestMapping("/supplier/supplier")
public class SupplierController {
	@Autowired
	private SupplierService supplierService;
	
	@GetMapping()
	@RequiresPermissions("supplier:supplier:supplier")
	String Supplier(){
	    return "supplier/supplier/supplier";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("supplier:supplier:supplier")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<SupplierDO> supplierList = supplierService.list(query);
		int total = supplierService.count(query);
		PageUtils pageUtils = new PageUtils(supplierList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("supplier:supplier:add")
	String add(){
	    return "supplier/supplier/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("supplier:supplier:edit")
	String edit(@PathVariable("id") Long id,Model model){
		SupplierDO supplier = supplierService.get(id);
		model.addAttribute("supplier", supplier);
	    return "supplier/supplier/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("supplier:supplier:add")
	public R save( SupplierDO supplier){
		if(supplierService.save(supplier)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("supplier:supplier:edit")
	public R update( SupplierDO supplier){
		supplierService.update(supplier);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("supplier:supplier:remove")
	public R remove( Long id){
		if(supplierService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("supplier:supplier:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		supplierService.batchRemove(ids);
		return R.ok();
	}
	
}
