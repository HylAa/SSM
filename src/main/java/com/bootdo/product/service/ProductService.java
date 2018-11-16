package com.bootdo.product.service;

import com.bootdo.product.domain.ProductDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Ahliang
 * @email 1992lcg@163.com
 * @date 2018-11-15 20:44:53
 */
public interface ProductService {
	
	ProductDO get(Long id);
	
	List<ProductDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ProductDO product);
	
	int update(ProductDO product);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
