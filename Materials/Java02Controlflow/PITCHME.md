
## Основы Java


@snap[north-west]
Лекция №2 - Control flow
@snapend

+++

@snap[north-west]
Как мы умеем делать?
@snapend

+++

@snap[north-west]
Как мы хотим? 
@snapend

+++

@snap[north-west]
Что мы хотим от программы
@snapend

@ol [list-bullets-black]
- Уметь ветвить ход работы программы
- Зацикливать фрагменты кода
- Вызывать в нужных нам местах рании фрагменты программы
@olend
---

# Ветвление 

+++
@snap[north-west]
Условные операторы
@snapend

@ol(false)
- Оператор `if` - позволяет выполнять блок кода только при выполнении условия
- Оператор `if-else` - позволяет выполнять один из двух блоков кода при выполнении условия
- Оператор  `switch` - позволяет выбирать один из нескольких блоков кода в зависимости от значения переменной
@olend

+++

@snap[north-west]
Оператор `if`
@snapend

@snap[west]
Зарезервированное слово if говорит о начале условной конструкции. Условие задает выполнится ли блок кода, заключенный в фигурные скобки
@snapend


+++

```Java
int a = 5;
int b = 4;

if(a>b){
	System.out.println("5 больше чем 4");
}

if(b>a){
	System.out.println("4 больше чем 5");
}

if(2*2==4){
	System.out.println("Конечно да!");
}

if(a==5)
	System.out.println("Так все равно сработает");

```

+++
@snap[north-west]
Оператор `if-else`
@snapend

@snap[east]
Работает аналогично оператору `if` только, если условие не выполняется, то выполняется код заключенный в фигурные скобки после оператора `else` перед тем как продолжить работу.
@snapend

+++

```Java
boolean codition = false;

if(condition){
	System.out.println("Выполняется основной блок")
}else {
	System.out.println("Выполняется блок else!")
}
```

---

# Switch

+++
@snap[north-west]
Оператор switch
@snapend

@snap[west]
Оператор switch используется в тех случаях, когда у нас большое количество проверок `if-else` одной и той же переменной. В качестве такой переменной может выступать переменные типов `int`, `char`, `String`.
@snapend

+++
@snap[north-west]
Оператор switch
@snapend

+++

@snap[north]
Вместо того чтобы писать
@snapend

```Java
int a=3;

if (a==1){
	System.out.println("1!");
} else if(a==2) {
	System.out.println("2!");
} else if(a==3) {
	System.out.println("3!");
} else if(a==4) {
	System.out,println("4!");
}

```
+++

@snap[north]
Мы используем конструкцию switch
@snapend

```Java
int a;
switch(a) {
	case 1:	System.out.println("1!");
				break;
	case 2:	System.out.println("2!");
				break;
	case 3:	System.out.println("3!");
				break;
	case 4:	System.out.println("4!");
				break;
	case default: System.out.println("Unknown");
}
```

+++

Кроме обычных case'ов, 'switch' имеет 'case default'. Этот случай наступает, когда не наступают остальные. Свитчи, которые имееют `default` case называются исчерпывающими

+++

@size[1.5em](Открыть программы swithWeek.java и switchMonthDays. Как работает оператор break?)

+++

@snap[north-west]
Оператор `break` в `switch`
@snapend

@snap[west]
Операор break немедленно выводить выполнение программы из оператора `switch`. Если тело одного `case` закончило выполняться и программа не нашла слово `break` - начнется выполнение слудующего кода `case`, даже если условие неверно
@snapend

---
# Функции

+++

@snap[north-west]
Функции
@snapend


@snap[west]
@ul(false)
- Заранее написать код
- Использовать тогда, когда захотим
- Чтобы можно было изменять поведние этого когда от некоторых параметров
@ulend
@snapend

+++?image=res/memes/ThinkAbout.jpg


+++ 

@ol
- Написать код для нашего фрагмента
- Объявить этот фрагмент
- Придумать имя
- Дать компилятору понять что это имнно код, а не переменная
- Описать наш фрагмент кода
@olend

+++

```Java
void printer(){
	System.out.println("Function printer was called!");
}

printer()
```

+++

@snap[north-west]
Функции
@snapend

Функции - фрагменты кода, обладающие именем, с помощью которого можно обрашаться к этому фрагменту. Функции также как и переменные имеют свои модификаторы такие как `static` или `public` 

+++?code=Materials/Java02Controlflow/CallingVoidFunction.java&lang=java

+++
@size[1.5.em](Пока все наши функции мы будем сопровождать свойством `static`. Избавиться от него мы сможем позже)
+++

@snap[north]
В чем разница между двумя функциями?
@snapend

```Java
System.out.println();
int numberOfKeyboard = reader.nextInt();
```

+++

@snap[north-west]
Оператор `return`
@snapend

@snap[west]
@ul(false)
- Нужен для определение, какой результат у функции
- Говорят функция возврашает значение
- Тип переменной возврашаемая опреатором return должен совпадать с типом функции
- При выполнении оператора return работа функции завершается
- Функция может иметь более одного оператора return 
@ulend
@snapend

+++?code=Materials/Java02Controlflow/CallingNonVoidFunctions.java&lang=java

@[11](Программа начинает выполняться c main)
@[12](Программа натыкается на вызов функции getMarkAsNumber)
@[3-4](Выполняется тело функции getMarkAsNumber)
@[13](Программа продолжает работу)
@[14](Теперь программа натыкается на вызов getMarkAsString)
@[7-8](Выполняется код функции getMarkAsString)
@[15](Управление возвращается в блок main)
 
+++

@snap[north-west]
Аргементы функции
@snap

@snap[west]
Аргементы функкции - это входные параметры функции, которые определяют специфику выполнения ее работы <br> Функция не знает о существовании переменных кроме тех которые определены в ее теле. Поэтому мы должны передать функции эти переменные
@snapend

+++

```Java
public static void summa(int a, int b){
	return a+b;
}

public static void main(String[] args){
	int a = 1;
	int b = 2;
	int sum = summa(a,b);
	// sum == 3
}
```

+++ 

@size[1.5em](Посмотрите функцию swap программы swaper. Объясните эту программу!)

  