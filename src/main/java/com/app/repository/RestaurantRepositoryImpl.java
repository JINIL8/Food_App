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
import com.app.entity.Restaurant;
import com.app.entity.User;

@Repository
public class RestaurantRepositoryImpl implements RestaurantRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void deleteRestaurant(Integer id) {
		Restaurant restaurant = getRestaurantById(id);
		sessionFactory.getCurrentSession().delete(restaurant);
	}

	@Override
	@Transactional
	public Restaurant getRestaurantByEmail(String email) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Restaurant.class);
		criteria.add(Restrictions.ilike("email_id", email));
		return (Restaurant) criteria.uniqueResult();
	}

	@Override
	@Transactional
	public Restaurant getRestaurantById(Integer id) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Restaurant.class);
		criteria.add(Restrictions.eq("id", id));
		return (Restaurant) criteria.uniqueResult();
	}

	@Override
	@Transactional
	public void insertRestaurant(Restaurant restaurant) {
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(restaurant);
	}

	@Override
	@Transactional
	public List<Restaurant> viewRestaurant() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Restaurant.class);
		return CastListElements.castList(Restaurant.class, criteria.list());
	}

	@Override
	@Transactional
	public Restaurant getRestaurantByRestaurantName(String restaurantname) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Restaurant.class);
		criteria.add(Restrictions.or(Restrictions.ilike("email_id", restaurantname), Restrictions.ilike("mobileno", restaurantname)));
		return (Restaurant) criteria.uniqueResult();
	}

}
