package logincredentials;

import java.util.Scanner;

public class UserLogin {
	
	String userId =  "pivotAdmin";
	String password = "Admin123";
	
	// create a method to check user login credentials
	void loginCheck() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username: ");
		String InputUserId = sc.next();
		
		System.out.println("Enter Password: ");
		String InputPassword = sc.next();

		if((InputUserId.equals(userId)) && (InputPassword.equals(password))) {
			System.out.println("You are logged in to the application");
		}
		else {
			System.out.println("Incorrect User id or password.Try again");
		}
		
	}
}
