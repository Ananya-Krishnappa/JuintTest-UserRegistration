/**
 * Purpose:To userRegistration.validate email ids
 * @author Ananya K
 * @version 1.0
 * @since 18/06/2021
 * 
 */
package bridgelabz.UserRegistration;

public class ValidateEmail {
	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		String email1 = "abc@yahoo.com";
		String email2 = "abc-100@yahoo.com";
		String email3 = "abc.100@yahoo.com";
		String email4 = "abc-100@abc.net";
		String email5 = "abc.100@abc.com.au";
		String email6 = "abc@1.com";
		String email7 = "abc@gmail.com.com";
		String email8 = "abc+100@gmail.com";
		String email9 = "abc";
		String email10 = "abc@.com.my";
		String email11 = "abc123@gmail.a";
		String email12 = "abc123@.com";
		String email13 = "abc123@.com.com";
		String email14 = ".abc@abc.com";
		String email15 = "abc()*@gmail.com";
		String email16 = "abc..2002@gmail.com";
		String email17 = "abc.@gmail.com";
		String email18 = "abc@abc@gmail.com";
		String email19 = "abc@gmail.com.1a";
		String email20 = "abc@gmail.com.aa.au ";
		String email21 = "abc@%*.com";

		userRegistration.validate(email1, InputField.EMAIL);
		userRegistration.validate(email2, InputField.EMAIL);
		userRegistration.validate(email3, InputField.EMAIL);
		userRegistration.validate(email4, InputField.EMAIL);
		userRegistration.validate(email5, InputField.EMAIL);
		userRegistration.validate(email6, InputField.EMAIL);
		userRegistration.validate(email7, InputField.EMAIL);
		userRegistration.validate(email8, InputField.EMAIL);
		userRegistration.validate(email9, InputField.EMAIL);
		userRegistration.validate(email10, InputField.EMAIL);
		userRegistration.validate(email11, InputField.EMAIL);
		userRegistration.validate(email12, InputField.EMAIL);
		userRegistration.validate(email13, InputField.EMAIL);
		userRegistration.validate(email14, InputField.EMAIL);
		userRegistration.validate(email15, InputField.EMAIL);
		userRegistration.validate(email16, InputField.EMAIL);
		userRegistration.validate(email17, InputField.EMAIL);
		userRegistration.validate(email18, InputField.EMAIL);
		userRegistration.validate(email19, InputField.EMAIL);
		userRegistration.validate(email20, InputField.EMAIL);
		userRegistration.validate(email21, InputField.EMAIL);
	}
}
