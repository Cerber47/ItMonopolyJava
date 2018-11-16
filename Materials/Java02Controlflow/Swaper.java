// Разобраться почему так происходит!

public class Swaper{
	//функция должна поменять местами значения переменных a и b
	static void swap(int a,int b){
		// надо запомнить b с помощью переменной storage а то мы потеряем ее значение
		int storage = b;
		b = a;
		a = storage;
	}

	public static void main(String[] args){
		int x = 10;
		int y = 20;
		System.out.printf("At first x=%d and y=%d\n",x,y);
		// Меняем местами x и y местами
		swap(x, y);
		System.out.printf("now x=%d and y=%d\n",x,y);
	}
}