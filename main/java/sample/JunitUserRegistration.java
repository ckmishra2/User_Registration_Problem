package sample;

import java.util.regex.*;

@FunctionalInterface
interface UserReg {
	boolean Compare(String userdetails);
}

public class JunitUserRegistration {
	public String regex;
	
	// method to validate first name
	static UserReg compareFirstName = (firstname)-> {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstname);
		System.out.println("FirstName Match-"+matcher.matches());
		return matcher.matches();
	};
	
	// method to validate last name
	static UserReg compareLastName = (lastName)-> {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		System.out.println("LastName Match-"+matcher.matches());
		return matcher.matches();
	};

	// method to validate email
	static UserReg compareEmail = (emailIds)-> {
		String regex = "^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailIds);
		System.out.println("EmailId Match-"+matcher.matches());
		return matcher.matches();
	};
	// method to validate mobilenumber
	static UserReg compareMobileNumber = (mobileNumber)-> {
		String regex = "[0-9]{0,2}[1-9] [0-9]{10}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobileNumber);
		System.out.println("Mobile Number Match-"+matcher.matches());
		return matcher.matches();
};
	// method to validate password minimum 8 characters
	//should have atleast 1 uppercase in password
	//should have atleast 1 numeric number in password
	//has exactly 1 special character
	static UserReg comparePassword = (password)->{
		String regex = "^[A-Za-z0-9@|$|%|&]{8}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
};
	public static void main(String[] args) {
		compareFirstName.Compare("Chandrakala");
		compareLastName.Compare("Mishra");
		compareEmail.Compare("abc.xyz@bl.co.in");
		compareMobileNumber.Compare("91 9919819801");
		comparePassword.Compare("ab@Aj8jr");
	}

}
