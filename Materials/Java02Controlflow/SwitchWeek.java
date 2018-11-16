
// Пример использования оператора Switch без проваливания
// Программа принимате на вход число - номер дня недели от 1 до 7 включительно
// и выводит на экран название этого дня недели
import java.util.Scanner;


public class SwitchWeek{
	public static void main(String[] args){
		// Объявляем наш сканнер с именем reader
		Scanner reader = new Scanner(System.in);

        // Читаем число и кладем его в переменную day
		int day = reader.nextInt();

		// Заранее объявили строку dayString
		String dayString;

		switch(day){
			// Если  day равно 1 то наш день понедельник
			case 1:	dayString = "Monday";
			// Выходим из свитча
					break;
			case 2:	dayString = "Tuesday";
					break;
			case 3:	dayString = "Wednesday";
					break;
			case 4:	dayString = "Thursday";
					break;
			case 5:	dayString = "Friday";
					break;
			case 6:	dayString = "Saturday";
					break;
			case 7: dayString = "Sunday";
					break;
			// Если ниодин из случаев не сработал - сработает этот
			default: dayString = "Error";
		}

		System.out.println(dayString);
	}
}