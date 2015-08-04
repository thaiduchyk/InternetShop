import org.junit.Assert;
import org.junit.Test;

public class TempTest {
	@Test
	public void testIsNull() {
		Boolean expectedResult = true;
		Temp temp = new Temp();
		String str = null;
		Boolean actualResult = temp.isNull(str);

		Assert.assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testIsUserCreated() {
		Boolean expectedResult = true;
		Temp temp = new Temp();
		String str = null;
		Boolean actualResult = temp.isUserCreated();

		Assert.assertEquals(expectedResult, actualResult);
	}
}
