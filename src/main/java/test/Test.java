package test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DAO.impl.OrdersDAOimpl;
import entity.Orders;
import entity.User;


public class Test {

	public static void main(String[] args) {
		
		Date date = new Date();
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"application-context.xml");
		Orders orders =  (Orders) appContext.getBean("orders");
		User user =  (User) appContext.getBean("user");
		OrdersDAOimpl ordersDAO = (OrdersDAOimpl) appContext.getBean("ordersDAOimpl");
		user.setIdUser(1);
		ordersDAO.saveOrder(user, date, 567.0);
		
//		System.out.println(ordersDAO.getOrdersByUser(user).get(0).getTotalPrice());
		
		
//		orders.setDateOfOrder(date);
//		System.out.println(orders.getDateOfOrder());
//		System.out.println(ordersDAO.getOrdersByIdUser(new Integer(1)).get(0).getIdUser());
//		List<Orders> list = new ArrayList();
//		list = ordersDAO.getAllOrders();
//		System.out.println("a  "+list.get(0).getDateOfOrder()+"  "+list.get(1).getDateOfOrder());
		
		
//		System.out.println(ordersDAO.getOrderById(2).getTotalPrice());

	}

}
