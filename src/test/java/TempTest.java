import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.api.support.membermodification.MemberMatcher;

import entity.User;

public class TempTest {
	Temp temp;

UserCreate userCreate;
	
	@Test
	public void testIsNull() {
		Boolean expectedResult = true;
		Temp temp = new Temp();
		String str = null;
		Boolean actualResult = temp.isNull(str);

		Assert.assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testIsUserCreated() throws IllegalArgumentException, IllegalAccessException {
		temp = new Temp();
		userCreate = Mockito.mock(UserCreate.class);
		MemberMatcher.field(Temp.class, "userCreate").set(temp, userCreate);
		Boolean expectedResult = true;
	
		String str = null;
		Mockito.when(userCreate.createUser(Mockito.anyString(), Mockito.anyString())).thenReturn(new User());
		Boolean actualResult = temp.isUserCreated();

		Assert.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void testIsUserCreatedFalse() throws IllegalArgumentException, IllegalAccessException {
		temp = new Temp();
		userCreate = Mockito.mock(UserCreate.class);
		MemberMatcher.field(Temp.class, "userCreate").set(temp, userCreate);
		Boolean expectedResult = false;
	
		String str = null;
		Mockito.when(userCreate.createUser(Mockito.anyString(), Mockito.anyString())).thenReturn(null);
		Boolean actualResult = temp.isUserCreated();

		Assert.assertEquals(expectedResult, actualResult);
	}
}
