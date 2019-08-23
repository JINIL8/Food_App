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
import com.app.entity.Dishes;

@Repository
public class DishesRepositoryImpl implements DishesRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void deleteDishes(Integer id) {
		Dishes dishes = getDishesById(id);
		sessionFactory.getCurrentSession().delete(dishes);
	}

	@Override
	@Transactional
	public Dishes getDishesByEmail(String email) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Dishes.class);
		criteria.add(Restrictions.ilike("email_id", email));
		return (Dishes) criteria.uniqueResult();
	}

	@Override
	@Transactional
	public Dishes getDishesById(Integer id) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Dishes.class);
		criteria.add(Restrictions.eq("id", id));
		return (Dishes) criteria.uniqueResult();
	}

	@Override
	@Transactional
	public void insertDishes(Dishes dishes) {
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(dishes);
	}

	@Override
	@Transactional
	public List<Dishes> viewDishes() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Dishes.class);
		return CastListElements.castList(Dishes.class, criteria.list());
	}

}
