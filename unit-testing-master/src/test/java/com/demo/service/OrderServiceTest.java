package com.demo.service;
import static org.junit.Assert.*;
//private static final double DELTA = 1e-15;
import com.demo.domain.Order;

import static org.junit.Assert.*;

import org.junit.Test;

import com.demo.domain.Order;

import static org.junit.Assert.assertTrue;

//import static org.junit.api.Assertions.*;
public class OrderServiceTest {
	

	Order o=new Order(12,"bread",70);
	@Test
	public void  placeordertest() {
		assertEquals(12,o.getQuantity());
		assertEquals("bread",o.getItemName());
	}
	  Order orderObj=new Order();
	
	@Test
	public void  checkpricewithtest() {
		orderObj.setPrice(70);
		double price=orderObj.getPrice();
	//	assertSame(price,70);
    
	}
	@Test
	public void  checkpricewithtaxtest() {
		orderObj.setPriceWithTax(50);
		double priceWithTax=orderObj.getPriceWithTax();
      
	}
	

}