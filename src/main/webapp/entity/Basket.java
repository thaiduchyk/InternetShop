package entity;

import java.util.Map;

public class Basket {
	
	private User user;
	
	//map for setting quantity of each article in basket
	private Map <Integer, Integer> articleQuantity;
	
	public Basket(){
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Map<Integer, Integer> getArticleQuantity() {
		return articleQuantity;
	}

	public void setArticleQuantity(Map<Integer, Integer> articleQuantity) {
		this.articleQuantity = articleQuantity;
	}
	
	

}
