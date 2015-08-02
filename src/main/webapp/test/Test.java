package test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Orders;

public class Test {

	public static void main(String[] args) {
		
		Date date = new Date();
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"application-context.xml");
		Orders orders =  (Orders) appContext.getBean("orders");
		orders.setDateOfOrder(date);
		System.out.println(orders.getDateOfOrder());

	}

}
