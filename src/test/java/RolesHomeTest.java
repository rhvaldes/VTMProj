package test.java;

import static org.junit.Assert.*;

import main.java.com.boa.dao.RolesHome;
import main.java.com.boa.domain.Roles;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RolesHomeTest {

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
		Roles role  = new Roles();
		role.setRoleName("foo");
		role.setRoleDescription("foobar");
		
		RolesHome roleHome = new RolesHome();
		
		assertNotNull(roleHome.findByExample(role));
		
	}

}
