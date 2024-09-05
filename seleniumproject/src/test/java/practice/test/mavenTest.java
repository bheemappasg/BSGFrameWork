package practice.test;

import org.testng.annotations.Test;

public class mavenTest {
	@Test
	public void conttest()
	{
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD= System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
	@Test
	public void conttest1()
	{
		System.out.println("conttest1");
	}
}
