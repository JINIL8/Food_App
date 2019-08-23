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
import com.app.entity.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void deleteUser(Integer id) {
		User user = getUserById(id);
		sessionFactory.getCurrentSession().delete(user);
	}

	@Override
	@Transactional
	public User getUserByEmail(String email) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
		criteria.add(Restrictions.ilike("email_id", email));
		return (User) criteria.uniqueResult();
	}

	@Override
	@Transactional
	public User getUserById(Integer id) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("id", id));
		return (User) criteria.uniqueResult();
	}

	@Override
	@Transactional
	public void insertUser(User user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
	}

	@Override
	@Transactional
	public List<User> viewUser() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
		return CastListElements.castList(User.class, criteria.list());
	}

	@Override
	@Transactional
	public User getUserByUserName(String username) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
		criteria.add(Restrictions.or(Restrictions.ilike("email_id", username), Restrictions.ilike("mobilenumber", username)));
		return (User) criteria.uniqueResult();
	}

}
