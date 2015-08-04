package entity;

public class Goods {
	private String name;
	private String size;
	private Integer price;
	private Boolean delivery;
	private Boolean guarantee;
	private String manufacturer;
	private String color;
	private User seller;
	private Category category;
	
	public Goods(String name, String size, Integer price, Boolean delivery,
			Boolean guarantee, String manufacturer, String color, User seller,
			Category category) {
		this.name = name;
		this.size = size;
		this.price = price;
		this.delivery = delivery;
		this.guarantee = guarantee;
		this.manufacturer = manufacturer;
		this.color = color;
		this.seller = seller;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Boolean getDelivery() {
		return delivery;
	}

	public void setDelivery(Boolean delivery) {
		this.delivery = delivery;
	}

	public Boolean getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(Boolean guarantee) {
		this.guarantee = guarantee;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	

	

}
