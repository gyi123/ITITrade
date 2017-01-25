package com.zzyy.web.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zzyy.data.domain.Category;
import com.zzyy.data.domain.Item;
import com.zzyy.data.domain.User;
import com.zzyy.data.dto.ItemDto;
import com.zzyy.service.ProductService;
import com.zzyy.service.UserService;

@Controller
public class MainController {
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/rest/categoryItems/{catId}", method = RequestMethod.GET)
    public @ResponseBody Set<ItemDto> getItemsByCategory(@PathVariable("catId") int catId) {
    	/*
    	Set<Item> items = new HashSet<Item>();
    	Item item1 = new Item();
    	item1.setId(1);
    	item1.setName("Rench");
    	item1.setDescription("This is the rench");
    	items.add(item1);
    	Item item2 = new Item();
    	item2.setId(2);
    	item2.setName("Air compressor");
    	item2.setDescription("This is the compressor");
    	items.add(item2);
    	return items;
    	*/
    	
    	Set<Item> items = productService.listItemsByCategory(catId);
    	Set<ItemDto> itemDtos = new HashSet<ItemDto>();
    	for(Item item : items) {
    		itemDtos.add(new ItemDto(item));
    	}
    	return itemDtos;
    }
    
    @RequestMapping(value = "/rest/allTopCategory", method = RequestMethod.GET)
    public @ResponseBody List<Category> getAllTopLevelCategories() {
        return productService.listAllTopCategory();
    }
    
    @RequestMapping(value = "/rest/user/{username}", method = RequestMethod.GET)
    public @ResponseBody User getUser(@PathVariable("username") String username) {
        return userService.getUser(username);
    }
    
    @RequestMapping(value = "/rest/item/{id}", method = RequestMethod.GET)
    public @ResponseBody Item getItemById(@PathVariable("id") int id) {
        return productService.getItemById(id);
    }
}
