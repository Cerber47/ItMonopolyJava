/*
StudentDataBase.java
by vanurin@phystech.edu
https://github.com/Cerber47/ItMonopolyJava

Программа реализует класс StudentInfo. Программа создает базу из 10
на начальный момент пустых мест под регистрацию студенту. Программа
предлагает либо зарегистрировать нового студента в базе, либо найти
и распечатать всю доступную на данный момент информаицю о выбранном
студенте.

Этот пример показывает самый простейший вариант реализации класса.
*/

import java.util.Scanner;


class StudentInfo{
	int id;
	String name;
	int age;
	int year;
	String course;

    // Метод возвращает все поля данного студента в виде одной строки
	public String info(){
		return String.format("Student %s(id:%d) %d years old. %d year. Study %s\n\n", name, id, age, year, course);
	}

}


public class StudentDataBase{
	static int id = 0;
	static Scanner input = new Scanner(System.in);

	// Массив куда мы будем ложить всех зарегестрированных студентов
	static StudentInfo[] students = new StudentInfo[10];

	public static void main(String[] args){
		
		int newActionId;
		boolean breakChoise = false;

		while(!breakChoise){
			System.out.println("Greetings!\nEnter 1 - to register new student\nEnter 2 - to look at student info\nEnter 0 - to exit programm");
			newActionId = input.nextInt();

			switch(newActionId){
				case 0:
					breakChoise = true;
					break;
				case 1:
					tryToAddNewStudent();
					break;
				case 2:
					tryToFindStudent();
					break;
				default:
					System.out.println("Could not understand reuest. Type 0 1 or 2 only!\n");				
			}
		}
	}

	public static void tryToFindStudent(){
		System.out.print("\nWelcome to students database. Enter student id:");
		int searchId = input.nextInt();
		boolean isPresented = false;
		int matchedId = -1;

		// Студента с таким id может и не быть
		for(int i=0;i<id;i++){
			if(students[i].id == searchId){
				isPresented = true;
				matchedId = i;
				break;
			}
		}

		if(isPresented){
			// Если такой студент найден то тогда распечатываем информацию о нем
			presentStudentInfo(matchedId);
		} else {
			// Если нет то сообщим об ошибке
			System.out.println("Sorry! Could not find student with granted id.\n\n");
		}
	}

	public static void presentStudentInfo(int id){
		System.out.println(students[id].info());
	}

	public static void tryToAddNewStudent(){
		// Наш массив может быть переполнен! Сначала надо убдеиться что мы не зарегестрируем 11ого студента
		if (id<10)
			registerNewStudent();
		else
			System.out.println("Error! Database is full. Try again later\n\n");
	}

	public static void registerNewStudent(){
		System.out.println("\nWelcome to creation new student master!");

		// Создаем нового студента
		StudentInfo newStudent = new StudentInfo();
		
		// Присваиваем полям студента все значения
		newStudent.id = id;
		
		System.out.print("Enter name:");
		newStudent.name = input.next();

		System.out.print("Enter age:");
		newStudent.age = input.nextInt();

		System.out.print("Enter year:");
		newStudent.year = input.nextInt();

		System.out.print("Enter course:");
		newStudent.course = input.next();

		// Кладем запись в массив. Студент успешно зарегестрирован!
		students[id] = newStudent;

		System.out.println("New student has been registred! with id:" + id + "\n\n");
		id++;

	}
}
