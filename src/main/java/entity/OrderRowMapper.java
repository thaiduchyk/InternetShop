package entity;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.RowMapper;
 
public class OrderRowMapper implements RowMapper
{
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"application-context.xml");
		Orders orders =  (Orders) appContext.getBean("orders");
		
		orders.setIdOrders(rs.getInt("idOrders")); 
		orders.setIdUser(rs.getInt("idUser"));
		orders.setDateOfOrder(rs.getDate("dateOfOrder"));
		orders.setTotalPrice(rs.getDouble("totalPrice"));
		return orders;
	}
 
}