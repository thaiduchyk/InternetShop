package DAO.inter;

import java.util.Date;
import java.util.List;
import java.util.Map;

import entity.Orders;
import entity.User;

public interface OrdersDAO {
	
	public void saveOrder(User user, Date date, Double totalPrice);
	public void saveOrder(Integer idUser, Date date, Double totalPrice);
	public Orders getOrderById(Integer id);
	public List<Orders> getOrdersByUser(User user);
	public List<Orders> getOrdersByIdUser(Integer iduser);
	public List<Orders> getAllOrders();

}
