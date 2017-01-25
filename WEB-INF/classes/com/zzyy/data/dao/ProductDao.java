package com.zzyy.data.dao;

import java.util.List;

import com.zzyy.data.domain.Category;
import com.zzyy.data.domain.Item;

public interface ProductDao {
    List<Category> getAllSubCategories(int parentCatId);
    Category getCategory(String catName);
    Category getCategory(int catId);
    List<Category> getTopLevelCategories();
    Item getItem(int itemId);
    
    void updateCategory(Category cat);
    void createCategory(Category cat);
    void updateItem(Item item);
    void createItem(Item item);
    void deleteCategory(Category cat);
    void deleteItem(Item item);
}
