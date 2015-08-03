package entity;

public class User {
	private Integer idUser;
	private String userName;
	private String userSurName;
	private String userLogin;
	private String userPassword;
	private String userAddress;
	private String userPhoneNumber;
	private String userEmail;
	private Boolean alreadybuy;
	private Boolean signedIn;
	
	

	public User(Integer idUser, String userName, String userSurName, String userLogin, String userPassword,
			String userAddress, String userPhoneNumber, String userEmail, Boolean alreadybuy, Boolean signedIn) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.userSurName = userSurName;
		this.userLogin = userLogin;
		this.userPassword = userPassword;
		this.userAddress = userAddress;
		this.userPhoneNumber = userPhoneNumber;
		this.userEmail = userEmail;
		this.alreadybuy = alreadybuy;
		this.signedIn = signedIn;
	}

	

	public User() {
		super();
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSurName() {
		return userSurName;
	}

	public void setUserSurName(String userSurName) {
		this.userSurName = userSurName;
	}

	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Boolean getAlreadybuy() {
		return alreadybuy;
	}

	public void setAlreadybuy(Boolean alreadybuy) {
		this.alreadybuy = alreadybuy;
	}



	public Boolean getSignedIn() {
		return signedIn;
	}



	public void setSignedIn(Boolean signedIn) {
		this.signedIn = signedIn;
	}
	
	

}
