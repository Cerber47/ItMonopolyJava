
# Основы Java

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
- Оператор `if-else` - позволяет выполнять один из двух блоков кода в зависимости от условия
- Оператор  `switch` - позволяет выбирать один из нескольких блоков кода в зависимости от значения переменной
@olend

+++

@snap[north-west]
Оператор `if`
@snapend

@snap[west]
Зарезервированное слово `if` сообщает компилятору о начале условной конструкции. Условие, заданное в скобках, задает выполнится ли блок кода, заключенный в фигурные скобки
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
Работает аналогично оператору `if` , только, если условие не выполняется, выполняется код заключенный в фигурные скобки после оператора `else`.
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

# Тернарный оператор ?

+++

@snap[north-west]
Тернарный оператор `?`
@snapend

@snap[west]
Используется, когда требуется выбрать одно из значений двух выражений в зависимости от условия. Вырадения разделяются символом `:`, а перед условием ставится `?`
@snapend

+++

```Java
// Example 1
String result = (2*2==4) ? "Дважды два - четыре" : "Дважды два - не четыре";

// Example 2
ina a = 1;
int b = 10;
System.out.println((a>b) ? "a>b" : "a<b");

```

---

# Switch

+++
@snap[north-west]
Оператор switch
@snapend

@snap[west]
Оператор `switch` используется в тех случаях, когда у нас большое количество проверок `if-else` одной и той же переменной. В качестве такой переменной может выступать переменные типов `int`, `char`, `String`.
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

Кроме обычных case'ов, 'switch' имеет 'default'. Этот случай наступает тогда, когда не наступают остальные. Свитчи, которые имееют `default` case называются исчерпывающими

+++

@size[1.5em](Открыть программы swithWeek.java и switchMonthDays. Как работает оператор break?)

+++

@snap[north-west]
Оператор `break` в `switch`
@snapend

@snap[west]
Оператор break немедленно выводит выполнение программы из оператора `switch`. Если тело одного `case` закончило выполняться и программа не нашла слово `break` - тогда начнется выполнение слудующего кода `case`, даже если условие неверно для этого блока неверно.
@snapend

---
# Функции

+++

@snap[north-west]
Что нам нужно
@snapend


@snap[west]
@ul(false)
- Заранее написать код
- Использовать тогда, когда захотим и столько раз, сколько захотим
- Чтобы можно было изменять поведние этого когда от некоторых параметров
@ulend
@snapend

+++?image=res/memes/ThinkAbout.jpg
@snap[north]
@color[white](Думай как компилятор!)
@snapend

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

Функции - фрагменты кода, обладающие именем, с помощью которого можно обрашаться к этому фрагменту кода. Функции также как и переменные имеют свои модификаторы такие как `static` или `public` 

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
- Нужен для определения, что считать резултатом функции
- Говорят, что такая функция __возврашает значение__
- Тип переменной возврашаемой опреатором return должен совпадать с типом функции
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
@size[1.5em](Почему опреатор return называется именно так? Что он "возврашает"?)
+++

@snap[north-west]
Аргументы функции
@snap

@snap[west]
Аргументы функкции - это входные параметры функции, которые определяют специфику выполнения ее работы <br> Функция не знает о существовании переменных кроме тех которые определены в ее теле и тех, что были переданы как аргументы. Поэтому мы должны передать функции эти переменные в качестве аргументов.
@snapend

+++

```Java
public static void summa(int a, int b){
// a и b это аргументы типа int функции summa()
	return a+b;
}

public static void main(String[] args){
	int a = 1;
	int b = 2;
	// Вызываем функцию summ()
	int sum = summa(a, b);
	// sum == 3
}
```

+++ 

@size[1.5em](Посмотрите функцию swap программы swaper. Объясните эту программу!)

---

@snap[north]
Что прошли по Control flow
@snapend

@snap[north-west]
@ol(False)
- Виды control flow
- Ветвление программы
-- `if`
-- `if-else`
-- `switch`
- Зацикливание фрагмента кода
-- `for`
-- `while`
-- `do-while`
-- `foreach`
- Функции

@olend
@snapend
+++

@size[1.5em](Задавайте свои вопросы!)

+++

@ol(false)
- Что такое логика программы?
- Какие виды управления выполнением программы вы знаете?
- Может ли `if-else` иметь два блока else?
- Нужен ли `break` кейсу `default` у `switch`?
- Может ли функция иметь неограниченное количество аргументов?
- Может ли функция работать одновременно с разными типами аргументов?
- Может ли функция вызывать саму себя?
@olend
