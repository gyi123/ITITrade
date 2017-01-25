package com.zzyy.data.dto;

import java.io.Serializable;
import java.util.Set;

import com.zzyy.data.domain.Category;
import com.zzyy.data.domain.Image;
import com.zzyy.data.domain.Item;

public class ItemDto implements Serializable{
    private int id;
    private String name;
    private String description;
    private int catId;
    private String fileName;
    
    public ItemDto() {
    	
    }
    
    public ItemDto(Item item) {
    	this.id = item.getId();
    	this.name = item.getName();
    	this.description = item.getDescription();
    	this.catId = item.getCategory().getId();
    	
    	//for now, only one image per item
    	Set<Image> images =item.getImages();
    	for(Image image : images) {
    	this.fileName = image.getFile();
    	}
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
    
    
}
