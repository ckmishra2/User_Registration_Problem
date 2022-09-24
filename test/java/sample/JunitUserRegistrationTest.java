package sample;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class JunitUserRegistrationTest {
	 String emailId;
	 Boolean expectedResult;
	 JunitUserRegistration JunitUserRegistration;

	@Before
	public void initialize() {
		JunitUserRegistration = new JunitUserRegistration();
	}

	public JunitUserRegistrationTest(String emailId, Boolean expectedResult) {
		this.emailId = emailId;
		this.expectedResult = expectedResult;
	}
//Parameterised Test to validate multiple entry for the Email Address.
	@Parameterized.Parameters
		   public static Collection emailId() {
		      return Arrays.asList(new Object[][] {
		         {"abc.xyz@bl.co.in", true},
		         {"abc-100@yahoo.com", true},
		         {"abc.100@yahoo.com", true},
		         {"abc111@abc.com", true},
		         {"xyz",false}
		      });
		   }
	
	@Test
	public void isemailIdProperReturnTrue() {
		  System.out.println("email id is : " + emailId);
	      Assert.assertEquals(expectedResult, JunitUserRegistration.validateEmailId(emailId));
		
	}
}

