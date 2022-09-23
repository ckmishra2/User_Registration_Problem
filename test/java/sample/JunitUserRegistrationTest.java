package sample;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class JunitUserRegistrationTest {

	JunitUserRegistration junitUserRegistration = new JunitUserRegistration();

	@Test
	public void givenFirstNameIsProperReturnTrue() {
		boolean actualResult = junitUserRegistration.firstName("Chandrakala");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	public void givenFirstNameIsProperReturnFalse() {
		boolean actualResult = junitUserRegistration.firstName("chandrakala");
		Assert.assertEquals(false, actualResult);
	}

	@Test
	public void givenLastNameIsProperReturnTrue() {
		boolean actualResult = junitUserRegistration.lastName("Mishra");
		Assert.assertEquals(true, actualResult);

	}

	@Test
	public void givenlastNameIsProperReturnFalse() {
		boolean actualResult = junitUserRegistration.lastName("mishra");
		Assert.assertEquals(false, actualResult);
	}
	public void givenemailIdIsProperReturnTrue() {
		boolean actualResult = junitUserRegistration.emailId("abc.xyz@bl.co.in");
		Assert.assertEquals(true, actualResult);
	}
	public void givenemailIdIsProperReturnFalse() {
		boolean actualResult = junitUserRegistration.emailId("abc.xyz@bl.co.in.");
		Assert.assertEquals(false, actualResult);
	}
}