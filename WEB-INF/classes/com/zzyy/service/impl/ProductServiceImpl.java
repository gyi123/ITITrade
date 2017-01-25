package com.zzyy.service.impl;

import java.util.List;
import java.util.Set;

import com.zzyy.data.dao.ProductDao;
import com.zzyy.data.domain.Category;
import com.zzyy.data.domain.Item;
import com.zzyy.service.ProductService;

public class ProductServiceImpl implements ProductService {
    
    private ProductDao dao;
    
    public ProductServiceImpl(ProductDao dao) {
	this.dao = dao;
    }

    @Override
    public List<Category> listAllTopCategory() {
	
	return dao.getTopLevelCategories();
    }

    @Override
    public Set<Item> listItemsByCategory(int catId) {
	Category cat = dao.getCategory(catId);
	return cat.getItems();
    }

    @Override
    public Item getItemById(int id) {
	return dao.getItem(id);
    }

}
