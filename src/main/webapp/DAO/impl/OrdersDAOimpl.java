package DAO.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import DAO.inter.OrdersDAO;
import entity.OrderRowMapper;
import entity.Orders;
import entity.User;

public class OrdersDAOimpl implements OrdersDAO{

	DataSource dataSource;

	JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void saveOrder(User user, Date date, Double totalPrice) {

		Object[] params = new Object[] { new Date(), user.getIdUser(), totalPrice };

		String sql = "INSERT INTO Orders(dateOfOrder, idUser, totalPrice) values(?,?,?)";

		jdbcTemplate.update(sql, params);

	}

	public void saveOrder(Integer idUser, Date date, Double totalPrice) {

		Object[] params = new Object[] { new Date(), idUser, totalPrice };

		String sql = "INSERT INTO Orders(dateOfOrder, idUser, totalPrice) values(?,?,?)";

		jdbcTemplate.update(sql, params);

	}

	public Orders getOrderById(Integer id) {

		String sql = "select * from internetshopdb.orders where idOrders=?";

		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new OrderRowMapper());

	}

	public List<Orders> getOrdersByUser(User user) {

		List<Orders> orders = new ArrayList<Orders>();

		String sql = "select * from internetshopdb.orders where iduser=?";
		SqlRowSet srs = jdbcTemplate.queryForRowSet(sql, new Object[] { user.getIdUser() });

		while (srs.next()) {
			Orders order = new Orders();
			order.setIdOrders(srs.getInt("idOrders"));
			order.setDateOfOrder(srs.getDate("dateOfOrder"));
			order.setIdUser(srs.getInt("idUser"));
			order.setTotalPrice(srs.getDouble("totalPrice"));
			orders.add(order);

		}
		return orders;

	}

	public List<Orders> getOrdersByIdUser(Integer iduser) {

		List<Orders> orders = new ArrayList<Orders>();

		String sql = "select * from internetshopdb.orders where iduser= ?";
		SqlRowSet srs = jdbcTemplate.queryForRowSet(sql, new Object[] { iduser });

		while (srs.next()) {
			Orders order = new Orders();
			order.setIdOrders(srs.getInt("idOrders"));
			order.setDateOfOrder(srs.getDate("dateOfOrder"));
			order.setIdUser(srs.getInt("idUser"));
			order.setTotalPrice(srs.getDouble("totalPrice"));
			orders.add(order);

		}
		return orders;

	}

	public List<Orders> getAllOrders() {

		List<Orders> orders = new ArrayList<Orders>();

		String sql = "select * from internetshopdb.orders";
		SqlRowSet srs = jdbcTemplate.queryForRowSet(sql);

		while (srs.next()) {

			Orders order = new Orders();
			order.setIdOrders(srs.getInt("idOrders"));
			order.setDateOfOrder(srs.getDate("dateOfOrder"));
			order.setIdUser(srs.getInt("idUser"));
			order.setTotalPrice(srs.getDouble("totalPrice"));
			orders.add(order);

		}
		return orders;

	}

}
