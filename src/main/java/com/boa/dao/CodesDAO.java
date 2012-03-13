package main.java.com.boa.dao;
// default package
// Generated Mar 9, 2012 2:46:44 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;

import main.java.com.boa.domain.CodesBO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Codes.
 * @see .Codes
 * @author Hibernate Tools
 */
public class CodesDAO {

	private static final Log log = LogFactory.getLog(CodesDAO.class);

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

	public void persist(CodesBO transientInstance) {
		log.debug("persisting Codes instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(CodesBO instance) {
		log.debug("attaching dirty Codes instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CodesBO instance) {
		log.debug("attaching clean Codes instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(CodesBO persistentInstance) {
		log.debug("deleting Codes instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CodesBO merge(CodesBO detachedInstance) {
		log.debug("merging Codes instance");
		try {
			CodesBO result = (CodesBO) sessionFactory.getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CodesBO findById(short id) {
		log.debug("getting Codes instance with id: " + id);
		try {
			CodesBO instance = (CodesBO) sessionFactory.getCurrentSession().get(
					"Codes", id);
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

	public List findByExample(CodesBO instance) {
		log.debug("finding Codes instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("Codes").add(Example.create(instance))
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
