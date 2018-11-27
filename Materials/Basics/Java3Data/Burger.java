public class Burger{
	int id = 10;

	public static void main(String[] args){
		Burgers order = Burgers.frenchfries;
		System.out.println(order.printinfo());
	}
}


public enum Burgers{
	cheeseBurger("Сырный бургер"),
	frenchfries("Картошечка фри"),
	coffe("Кофе");
	String description;
	Burgers(String description){
		this.description = description;
	}
	public String printInfo(){
		return description;
	}

}