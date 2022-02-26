package com.demo.service;

import static org.junit.Assert.assertSame;

import org.junit.BeforeClass;
import org.junit.Test;

import com.demo.domain.Order;

public class EmailServiceTest {
	static EmailService objEmailService;
	EmailService obj = new EmailService();
    Order orderobj= new Order();
	
	@BeforeClass
	public static void setUp() {
		objEmailService=EmailService.getInstance();
	}
	@Test
	public void testSingletonObject_true(){
		assertSame(EmailService.getInstance(),objEmailService);
		
	}
	@Test
	public void testSingletonObject_false(){
		assertSame(EmailService.getInstance(),new EmailService());
		
	}
	@Test(expected = RuntimeException.class)
    public void testSecondMethod() 
    {
     obj.sendEmail(orderobj);
       }
}
	

