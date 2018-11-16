package com.bootdo.supplier.service;

import com.bootdo.supplier.domain.SupplierDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-11-16 10:18:05
 */
public interface SupplierService {
	
	SupplierDO get(Long id);
	
	List<SupplierDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(SupplierDO supplier);
	
	int update(SupplierDO supplier);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
