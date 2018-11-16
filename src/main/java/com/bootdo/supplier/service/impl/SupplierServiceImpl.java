package com.bootdo.supplier.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.supplier.dao.SupplierDao;
import com.bootdo.supplier.domain.SupplierDO;
import com.bootdo.supplier.service.SupplierService;



@Service
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	private SupplierDao supplierDao;
	
	@Override
	public SupplierDO get(Long id){
		return supplierDao.get(id);
	}
	
	@Override
	public List<SupplierDO> list(Map<String, Object> map){
		return supplierDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return supplierDao.count(map);
	}
	
	@Override
	public int save(SupplierDO supplier){
		return supplierDao.save(supplier);
	}
	
	@Override
	public int update(SupplierDO supplier){
		return supplierDao.update(supplier);
	}
	
	@Override
	public int remove(Long id){
		return supplierDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return supplierDao.batchRemove(ids);
	}
	
}
