package com.zzyy.service;

import java.util.List;
import java.util.Set;

import com.zzyy.data.domain.Category;
import com.zzyy.data.domain.Item;

public interface ProductService {
    public List<Category> listAllTopCategory();
    public Set<Item> listItemsByCategory(int catId);
    public Item getItemById(int id);
}
