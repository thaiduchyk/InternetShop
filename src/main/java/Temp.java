public class Temp {

	UserCreate userCreate = null;

	public Boolean isNull(Object obj) {
		return obj == null;
	}

	public Boolean isUserCreated() {
		if (userCreate.createUser("Mykola", "Pomfyuk") != null) {
			return true;
		}
		return false;
	}
	
}
