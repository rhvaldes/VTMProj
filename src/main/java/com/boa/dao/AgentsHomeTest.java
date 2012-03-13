package main.java.com.boa.dao;

import static org.junit.Assert.*;

import main.java.com.boa.domain.Agents;

import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AgentsHomeTest {
	private AgentsHome agentsHome;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPersist() {
		Agents agent = new Agents("","Luis","BetancourtGay",null);
		agentsHome.persist(agent);		
		assertNotNull(agentsHome.findByExample(agent));
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

}
