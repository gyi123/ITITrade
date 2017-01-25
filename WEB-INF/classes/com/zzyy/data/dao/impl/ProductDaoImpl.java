package com.zzyy.data.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.zzyy.data.dao.ProductDao;
import com.zzyy.data.domain.Category;
import com.zzyy.data.domain.Item;

public class ProductDaoImpl implements ProductDao {

    private SessionFactory sessionFactory;
    public ProductDaoImpl(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
    }
    
    @Override
    public List<Category> getAllSubCategories(int parentCatId) {
	Session sess = sessionFactory.openSession();
	Criteria criteria = sess.createCriteria(Category.class)
	    .add(Restrictions.eq("parentId", parentCatId));
	return criteria.list();	
    }

    @Override
    public Category getCategory(String categoryName) {
	Session sess = sessionFactory.openSession();
	Criteria criteria = sess.createCriteria(Category.class)
	    .add(Restrictions.eq("name", categoryName));
	Category cat = (Category)criteria.list().get(0);
	return cat;
    }

    @Override
    public List<Category> getTopLevelCategories() {
	Session sess = sessionFactory.openSession();
	Criteria criteria = sess.createCriteria(Category.class)
	    .add(Restrictions.eq("generation", 0));
	return criteria.list();
    }

    @Override
    public Item getItem(int itemId) {
	Session sess = sessionFactory.openSession();
	Criteria criteria = sess.createCriteria(Item.class)
	    .add(Restrictions.eq("id", itemId));
	Item item = (Item)criteria.list().get(0);
	return item;
    }

    @Override
    public Category getCategory(int catId) {
	Session sess = sessionFactory.openSession();
	Criteria criteria = sess.createCriteria(Category.class)
	    .add(Restrictions.eq("id", catId));
	Category cat = (Category)criteria.list().get(0);
	return cat;
    }

    @Override
    public void updateCategory(Category cat) {
	Session sess = sessionFactory.openSession();
	sess.saveOrUpdate(cat);
    }

    @Override
    public void createCategory(Category cat) {
	Session sess = sessionFactory.openSession();
	sess.saveOrUpdate(cat);
     }

    @Override
    public void updateItem(Item item) {
	Session sess = sessionFactory.openSession();
	sess.saveOrUpdate(item);
     }

    @Override
    public void createItem(Item item) {
	Session sess = sessionFactory.openSession();
	sess.saveOrUpdate(item);
    }

    @Override
    public void deleteCategory(Category cat) {
	Session sess = sessionFactory.openSession();
	sess.delete(cat);
    }

    @Override
    public void deleteItem(Item item) {
	Session sess = sessionFactory.openSession();
	sess.delete(item);	
    }
    
    
}
