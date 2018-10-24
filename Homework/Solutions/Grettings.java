import java.util.Scanner;

public class Grettings{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = reader.next();

		System.out.println("Grettings " + name + "!");

	}
}