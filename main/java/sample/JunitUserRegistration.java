package sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JunitUserRegistration {

	public String regex;

	// method to validate first name
	public boolean firstName(String firstName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}

	public boolean lastName(String lastName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}

	public boolean emailId(String emailIds) {
		regex = "^[a-zA-Z0-9]+([.][0-9a-zA-z]+)*@[a-z]+.[a-z]{2,3}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailIds);
		return matcher.matches();
	}

}