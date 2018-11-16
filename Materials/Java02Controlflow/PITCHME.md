
## Основы Java


@snap[north-west]
Лекция №2 - Control flow
@snapend

---
@snap[north-west]
Как мы умеем делать?
@snapend
---
@snap[north-west]
Как мы хотим? 
@snapend
---

@snap[north-west]
Что мы хотим от программы
@snapend

@ol [list-bullets-black]
- Уметь ветвить ход работы программы
- Зацикливать фрагменты кода
- Вызывать в нужных нам местах рании фрагменты программы
@olend
---

## Ветвление 

---
@snap[north-west]
Условные операторы
@snapend

@ol(false)
- Оператор `if` - позволяет выполнять блок кода, только при выполнении условия
- Оператор `if-else` - позволяет выполнять один из двух блоков кода при выполнении условия
- Оператор  `switch` - позволяет выбирать один из нескольких блоков кода в зависимости от значения выбранной переменной
@olend

---

@snap[north-west]
Оператор if
@snapend


---

```Java
int a = 5;
int b = 4;

// В консоль выведется сообщение
if(a>b){
	System.out.println("5 больше чем 4");
}

// Ничего не произойдет
if(b>a){
	System.out.println("4 больше чем 5");
}

//Равняется ли 2*2  4?
if(2*2==4){
	System.out.println("Конечно да!");
}

// Скобки ставить для одной операции необязательно
if(a==5)
	System.out.println("Так все равно сработает");

```

---
@snap[north-west]
Оператор if-else
@snapend

---
@snap[north-west]
Оператор swith
@snapend

---
@snap[north-west]
Логические операторы
@snapend


| Логические операторы |     Значения     |      Пример     |
|:--------------------:|:----------------:|:---------------:|
|          ==          |       Равно      |      a == b     |
|          !=          |     Не равно     |      a != b     |
|          >=          | Больше или равно |      a >= b     |
|          <=          | Меньше или равно |      a <= b     |
|           >          |      Больше      |      a > b      |
|           <          |      Меньше      |      a < b      |
|          ||          |        Или       |  (a>b) || (c<d) |
|          &&          |         И        | (a>b) && (c>b)  |
|           !          |        Не        |      !(a>b)     |

---
@snap[north-west]
Оператор switch
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

+++?image=res/ThinkAbout.jpg%size=auto 100%

@snap[north]
<h1>@color[#FFFFFF](Думай как компилятор)</h1>
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

+++

@snap[north]
В чем разница между двумя функциями?
@snapend

```Java
System.out.println();
int numberOfKeyboard = reader.nextInt();
```

+++?code=CallingVoidFunction.java&lang=java

+++

@snap
Оператор `return`
@snapend

@snap[north-west]
@ul(false)
- Нужен для определение, какой результат у функции
- Говорят функция возврашает значение
- Тип переменной возврашаемая опреатором return должен совпадать с типом функции
- При выполнении оператора return работа функции завершается
- Функция может иметь более одного оператора return 
@ulend
@snapend

+++?code=CallingNonVoidFunctions.java&lang=java

@[17](Программа начинает выполняться c main)
@[18](Программа натыкается на вызов функции getMarkAsNumber)
@[9-10](Выполняется тело функции getMarkAsNumber)
@[19](Программа продолжает работу)
@[20](Теперь программа натыкается на вызов getMarkAsString)
@[13-14](Выполняется код функции getMarkAsString)
@[21](Управление возвращается в блок main)
 
+++
