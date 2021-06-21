package bridgelabz.UserRegistration;

import java.util.Scanner;

public class UserRegistrationMain {
	public static void main(String[] args) throws UserRegistrationException {
		UserRegistration ur = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String fn = sc.nextLine();
		ur.validate(fn, InputField.FIRST_NAME);
		System.out.println("Enter last name");
		String ln = sc.nextLine();
		ur.validate(ln, InputField.LAST_NAME);
		System.out.println("Enter email");
		String email = sc.nextLine();
		ur.validate(email, InputField.EMAIL);
		System.out.println("Enter phone number");
		String phno = sc.nextLine();
		ur.validate(phno, InputField.PHONE_NO);
		System.out.println("Enter password");
		String password = sc.nextLine();
		ur.validate(password, InputField.PASSWORD);
		sc.close();
	}
}
