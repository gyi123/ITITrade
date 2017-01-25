package com.zzyy.data.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.zzyy.data.dao.UserDao;
import com.zzyy.data.domain.User;

public class UserDaoImpl implements UserDao {
    private SessionFactory sessionFactory;
    public UserDaoImpl(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
    }

    @Override
    public User getUserByName(String userName) {
	Session sess = sessionFactory.openSession();
	Criteria criteria = sess.createCriteria(User.class)
	    .add(Restrictions.eq("name", userName));
	User user = (User)criteria.list().get(0);
	return user;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> getUsers() {
	Session sess = sessionFactory.openSession();
	Criteria criteria = sess.createCriteria(User.class);
	return criteria.list();
    }

    @Override
    public void update(User user) {
	Session sess = sessionFactory.openSession();
	sess.saveOrUpdate(user);
    }

    @Override
    public void create(User user) {
	Session sess = sessionFactory.openSession();
	sess.saveOrUpdate(user);	
    }

    @Override
    public void delete(User user) {
	Session sess = sessionFactory.openSession();
	sess.delete(user);
    }

}
