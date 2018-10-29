import java.util.Scanner;

public class Login{
	public static void main(String[] args){
		String rightPassword = "Admin";

		Scanner reader = new Scanner(System.in);

		System.out.println("Enter password:");
		String password = reader.next();

		if(rightPassword.equals(password)){
			System.out.println("Access granted!");
		} else {
			System.out.println("Access denied!");
		}
	}
}