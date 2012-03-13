package main.java.com.boa.dao;
// default package
// Generated Mar 9, 2012 2:46:44 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;

import main.java.com.boa.domain.CategoriesBO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Categories.
 * @see .Categories
 * @author Hibernate Tools
 */
public class CategoriesDAO {

	private static final Log log = LogFactory.getLog(CategoriesDAO.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(CategoriesBO transientInstance) {
		log.debug("persisting Categories instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(CategoriesBO instance) {
		log.debug("attaching dirty Categories instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CategoriesBO instance) {
		log.debug("attaching clean Categories instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(CategoriesBO persistentInstance) {
		log.debug("deleting Categories instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CategoriesBO merge(CategoriesBO detachedInstance) {
		log.debug("merging Categories instance");
		try {
			CategoriesBO result = (CategoriesBO) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CategoriesBO findById(short id) {
		log.debug("getting Categories instance with id: " + id);
		try {
			CategoriesBO instance = (CategoriesBO) sessionFactory
					.getCurrentSession().get("Categories", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CategoriesBO instance) {
		log.debug("finding Categories instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("Categories").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
