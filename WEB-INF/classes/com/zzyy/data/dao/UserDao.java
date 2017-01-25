package com.zzyy.data.dao;

import java.util.List;

import com.zzyy.data.domain.User;

public interface UserDao {
    public User getUserByName(String userName);

    public List<User> getUsers();
    
    public void update(User user);
    
    public void create(User user);
    
    public void delete(User user);
}
