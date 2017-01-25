package com.zzyy.data.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@imageId")
public class Image implements Serializable {
    private int id;
    private String name;
    private String file;
    private byte[] binary;
    private Item item;
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
    public String getFile() {
        return file;
    }
    public void setFile(String file) {
        this.file = file;
    }
    public byte[] getBinary() {
        return binary;
    }
    public void setBinary(byte[] binary) {
        this.binary = binary;
    }
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    
}
