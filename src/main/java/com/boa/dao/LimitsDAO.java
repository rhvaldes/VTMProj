package main.java.com.boa.dao;
// default package
// Generated Mar 9, 2012 2:46:44 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;

import main.java.com.boa.domain.LimitsBO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Limits.
 * @see .Limits
 * @author Hibernate Tools
 */
public class LimitsDAO {

	private static final Log log = LogFactory.getLog(LimitsDAO.class);

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

	public void persist(LimitsBO transientInstance) {
		log.debug("persisting Limits instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(LimitsBO instance) {
		log.debug("attaching dirty Limits instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LimitsBO instance) {
		log.debug("attaching clean Limits instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(LimitsBO persistentInstance) {
		log.debug("deleting Limits instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LimitsBO merge(LimitsBO detachedInstance) {
		log.debug("merging Limits instance");
		try {
			LimitsBO result = (LimitsBO) sessionFactory.getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public LimitsBO findById(short id) {
		log.debug("getting Limits instance with id: " + id);
		try {
			LimitsBO instance = (LimitsBO) sessionFactory.getCurrentSession().get(
					"Limits", id);
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

	public List findByExample(LimitsBO instance) {
		log.debug("finding Limits instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("Limits").add(Example.create(instance))
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
