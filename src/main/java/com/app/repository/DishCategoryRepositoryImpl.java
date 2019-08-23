package com.app.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.Constants.CastListElements;
import com.app.entity.DishCategory;
import com.app.entity.Restaurant;

@Repository
public class DishCategoryRepositoryImpl implements DishCategoryRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void deleteDishCategory(Integer id) {
		DishCategory dishcategory= getDishCategoryById(id);
		sessionFactory.getCurrentSession().delete(dishcategory);
	}

	@Override
	@Transactional
	public DishCategory getDishCategoryByEmail(String email) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(DishCategory.class);
		criteria.add(Restrictions.ilike("email_id", email));
		return (DishCategory) criteria.uniqueResult();
	}

	@Override
	@Transactional
	public DishCategory getDishCategoryById(Integer id) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(DishCategory.class);
		criteria.add(Restrictions.eq("id", id));
		return (DishCategory) criteria.uniqueResult();
	}

	@Override
	@Transactional
	public void insertDishCategory(DishCategory dishcategory) {
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(dishcategory);	
	}

	@Override
	@Transactional
	public List<DishCategory> viewDishCategory() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(DishCategory.class);
		return CastListElements.castList(DishCategory.class, criteria.list());
	}


}
