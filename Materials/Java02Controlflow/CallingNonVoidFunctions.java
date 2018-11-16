// CallingVoidFunction.java
// by Aleksey vanurin vanurin@phystech.edu
// https://itmonopoly.ru/
// 
// Пример вызовов различных не. войд функкций

public class CallingNonVoidFunctions{

	static int getMarkAsNumber(){
		return 10;
	}

	static String getMarkAsString(){
		return "Excelent!";
	}

	public static void main(String[] args){
		int markNumber = getMarkAsNumber();
		System.out.print(markNumber + " ");
		String markDescription = getMarkAsString();
		System.out.print(markDescription);
	}
}