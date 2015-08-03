package entity;

import java.util.Date;

// This is "Orders" entity according to appropriate table in DB.
public class Orders {
	private Integer idOrders;
	private Date dateOfOrder;
	private Integer idUser;
	private Double totalPrice;
	

	public Orders(Integer idOrders, Date dateOfOrder, Integer idUser, Double totalPrice) {
		super();
		this.idOrders = idOrders;
		this.dateOfOrder = dateOfOrder;
		this.idUser = idUser;
		this.totalPrice = totalPrice;
	}


	public Double getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public Orders() {
		super();
	}

	public Integer getIdOrders() {
		return idOrders;
	}

	public void setIdOrders(Integer idOrders) {
		this.idOrders = idOrders;
	}

	public Date getDateOfOrder() {
		return dateOfOrder;
	}

	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

}


