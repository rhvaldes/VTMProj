package main.java.com.boa.dao;
// default package
// Generated Mar 9, 2012 2:46:44 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;

import main.java.com.boa.domain.AgentsBO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Agents.
 * @see .Agents
 * @author Hibernate Tools
 */
public class AgentsHome {

	private static final Log log = LogFactory.getLog(AgentsHome.class);

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

	public void persist(AgentsBO transientInstance) {
		log.debug("persisting Agents instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(AgentsBO instance) {
		log.debug("attaching dirty Agents instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AgentsBO instance) {
		log.debug("attaching clean Agents instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(AgentsBO persistentInstance) {
		log.debug("deleting Agents instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AgentsBO merge(AgentsBO detachedInstance) {
		log.debug("merging Agents instance");
		try {
			AgentsBO result = (AgentsBO) sessionFactory.getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public AgentsBO findById(java.lang.String id) {
		log.debug("getting Agents instance with id: " + id);
		try {
			AgentsBO instance = (AgentsBO) sessionFactory.getCurrentSession().get(
					"Agents", id);
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

	public List findByExample(AgentsBO instance) {
		log.debug("finding Agents instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("Agents").add(Example.create(instance))
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
