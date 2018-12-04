/*
ScopeExample.java
by vanurin@phystech.edu
https://github.com/Cerber47/ItMonopolyJava

Пример показывает различные случаи работы программы, когда 
имена переменных совпадают и появляется неоднозначность 
того что такое id.
*/


class Example{
	// Переменная класса example
	int id = 0;

	public void printLocaleId(){
		System.out.println("\nMethod printLocaleId:");
		// Локальная переменная метода
		int id = 10;
		System.out.println("id=" + id);
	}

	public void printClassId(){
		System.out.println("\nMethod printClassId:");
		System.out.println("id=" + id);
	}

	public void printId(int id){
		System.out.println("\nMethod printId:");
		System.out.println("id=" + id);
	}

	public void printThisId(int id){
		System.out.println("\nMethod printClassIs");
		System.out.println("id=" + this.id);

	}
}


public class ScopeExample{
	public static void main(String[] args){
		Example test = new Example();

		// Распечатается локальная переменная или переменная объекта?
		test.printLocaleId();
		// Распечатается переменная объекта, если она объявлена вне метода?
		test.printClassId();
		// Распечатется аргумент 5 или переменная объекта? Имена то у них одинаковые?
		test.printId(5);
		// А в этом случае?
		test.printThisId(100);
	}
}
