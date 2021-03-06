# К-меры

## Генетика

Генетический код состит из 4ех нуклеотидов, которые записываются 4мя различными буквами соответвенно: A,G,C,T. Когда секвенатор (прибор для определение генетиечского кода из биоматериала) не может точно определить нуклеотид - в соответвующей позиции ставят букву N. Таким образом любая последовательность нуклеотидов взаимнооднозначно кодируется последовательностью 5 символов. Код будет выглядить, например как строчка ниже

```
AGGGTGCTAGTCGTTTCGAGNNATTTCGNACCCAATTTTAGCGCGTTTTGGCGCGTTATTGCGTCG
```

_К-мером__ называется последовательность из K нуклеотидов. Например для k=2 возможных k-меров только 16: AA,AG,AC,AT,GA,GC,GG,GT,CA,CG,CC,CT,TA,TG,TC,TT. Если учитывать еще и неизвестный нуклеотид N, то вариантов становится еще больше. Потенциально это может быть любая из 4ех букв, поэтому точно сказать сколько каких k-меров мы не можем. Таблица k-меров(сколько представлено каждого возможного k-мера) является очень важным инструментов для дальнейшей сборки просеквенированных генетических данных. 

## Постановка задачи

Имется текстовый файл \*\.txt в котором записанна последовательность нуклеотидов с символом "E" на оконце, который маркирует окончание файла. Требуется подсчитать количество каждого k-мера и вывести их в виде таблице, указывая в скобочках сколько их может быть в действительности в зависимости от k-меров c неизвестным нуклеотидом. Причем эта особенность должна быть настраивая при вызове. Например если мы хотим посчитать количество k-меров с `k=3` из файла `rna.txt` с учетом буквы N, запуск программы должен иметь вид

```
java KmerCounter rna.txt 2 -n true
```

Здесь -n означает некоторый параметр n, который должен иметь значение true или false. Если пользователь не хочет делать учет букв N, он может опустить параметр `n true` и вызвать точно также.

## Примеры ввода и вывода

Файл rna.txt :

```
ATATCNAATE
```

Вызов при k=2, n=true

```
AT : 3
TA : 1
TC : 1
CA : 0(1)
CG : 0(1)
CC : 0(1)
CT : 0(1)
AA : 1(2)
GA : 0(1)
CA : 0(1)
TA : 0(1)
```

## Ссылки

[Нуклеотиды](https://en.wikipedia.org/wiki/Nucleotide)
[К-меры](https://en.wikipedia.org/wiki/K-mer)
[Генетический код](https://en.wikipedia.org/wiki/Genetic_code)
[Аргументы командной строки](https://docs.oracle.com/javase/tutorial/essential/environment/cmdLineArgs.html)
[Словари](https://www.w3schools.com/java/java_hashmap.asp)