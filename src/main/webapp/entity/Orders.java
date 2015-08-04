package entity;

import java.util.Date;
//hello 

public class Orders {
	private Integer idOrders;
	private Date dateOfOrder;
	private Integer idUser;

	public Orders(Integer idOrders, Date dateOfOrder, Integer idUser) {
		super();
		this.idOrders = idOrders;
		this.dateOfOrder = dateOfOrder;
		this.idUser = idUser;
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
