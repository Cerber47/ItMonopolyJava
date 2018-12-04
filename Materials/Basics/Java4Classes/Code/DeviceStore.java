/*
StudentDataBase.java
by vanurin@phystech.edu
https://github.com/Cerber47/ItMonopolyJava

Программа реализует базу данных магазина по продаже техники.
В Классе Store собирается информация о всех устройствах

Файл демонстрирует работу конструкторов
*/

public class DeviceStore{
	public static void main(String[] args){
		// Инициализируем объект technoStore с помощью конструктора
		Store technoStore = new Store();

		technoStore.printAllInStock();
	}
}


// Класс устройство. Хранит в себе описание об устройстве
class Device{
	static int idFactory = 0;

	int id;
	String name;
	double price;
	DeviceType type;

	// Конструктор
	Device(String name, double price, DeviceType type){
		// Id  генерируется автоматически. Статическая переменная idFactory общая у всех объектов этого класса
		id = generateNewId();
		this.name = name;
		this.price = price;
		this.type = type;
	}

	// Генерирует каждый раз новое число
	static int generateNewId(){
		return ++idFactory;
	}

	// Вернуть строкове представление о всех полях класса
	public String generateInfoString(){
		return String.format("[id#%d]\t -%15s(%s)\t price-%.2f$\t", id, name, type.getInfoString(), price);
	}
}


// Класс магазин. Здесь хранятся все доступные к покупке товары
class Store{
	Device[] stock;
	// Конструктор
	Store(){
		Device[] stock = { new Device("Macbook", 1010.10, DeviceType.laptop),
				new Device("Ipad", 679.99, DeviceType.tablet),
				new Device("ChromeBook", 310.00, DeviceType.laptop),
				new Device("Iphone XS", 1010.10, DeviceType.smartphone),
				new Device("Xiomi Mi 8", 470.50, DeviceType.smartphone),
				new Device("Xiomi Band 3", 221.33, DeviceType.unknown),
				new Device("Lenovo thinkpad", 300.00, DeviceType.laptop),
		};
		this.stock = stock;
	}


	public void printAllInStock(){
		System.out.println("Today in stock we have:");
		for(Device device: stock){
			System.out.println(device.generateInfoString());
		}
		System.out.println("--------------------------------\n");
	}
}


enum DeviceType{
	laptop("LPT"),
	smartphone("SPH"),
	tablet("TBL"),
	unknown;

	String code;
	// Конструктор для типов с строкой
	DeviceType(String code){
		this.code = code;
	}
	// Дефолтный конструктор для типа unknown
	DeviceType(){}

	public String getInfoString(){
		return (this==DeviceType.unknown) ? "???" : code;
	}
}
