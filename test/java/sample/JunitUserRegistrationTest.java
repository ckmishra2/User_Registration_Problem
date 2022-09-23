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

}