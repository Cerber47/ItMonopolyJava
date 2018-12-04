public class StaticExample {
	public static void main(String[] args) {
		// Создаем два экземпляра
		Example exampleObj1 = new Example();
		Example exampleObj2 = new Example();

		// Можно ипользовать переменную как у объекта так и класса. Разницы нет
		System.out.println(exampleObj1.someInt);
		System.out.println(Example.someInt);
		// В обоих случаях будет напечатано 0

        // Попробуем увеличить статическую переменную
		System.out.println(exampleObj1.someInt++);
		System.out.println(exampleObj2.someInt++);
		System.out.println(exampleObj1.someInt);

		// Для не статических переменных такое бы не сработало
		System.out.println(exampleObj1.anotherInt++);
		System.out.println(exampleObj2.anotherInt);
		// Числа разные, т.к. переменные разные
	}
}

class Example {
	static int someInt = 0;
	int anotherInt;

	Example() {
		anotherInt = 1;
	}
}