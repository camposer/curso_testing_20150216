package curso.testing.basico;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

public class Test {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}

	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@org.junit.Test
	public void test1() {
		Assert.assertTrue(2 == 2);
	}

	@org.junit.Test
	public void test2() {
		Assert.assertTrue(2 == 2);
	}

	@Ignore
	@org.junit.Test
	public void test3() {
		Assert.assertTrue(3 == 2);
	}
}
