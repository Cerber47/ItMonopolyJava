import java.util.Scanner;

public class Sypher{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);

		int rightCode = 1234;
		System.out.println("Enter secret code:");

		int attempt = reader.nextInt();

		if (rightCode==attempt){
			System.out.println("The code is correct!");
		} else {
			System.out.println("The code is wrong!");
		}

	}
}