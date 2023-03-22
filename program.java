/**
 * program
 */
public class program {
        public static void main(String[] args) {
            System s = null;
        System.out.println(s);  //s
    }
}
 




/////////////////////////////////////////////////////////////////

//Основы: типы данных

class Program
{
 public static void main(String[] args) {
 short age = 10;
 int salary = 123456;
 System.out.println(age); //10
 System.out.println(salary); //123456
 }
}





/////////////////////////////////////////////////////////////////

//Основы: типы данных

//ВЕЩЕСТВЕННЫЕ ЧИСЛА

class Program
{
 public static void main(String[] args) {
 float e = 2.7f; // НУЖЕН СУФФИКС f
 double pi = 3.1415; //А ДЛЯ double ОН НЕ НУЖЕН
 System.out.println(e); // 2.7
 System.out.println(pi); // 3.1415
 }
}





/////////////////////////////////////////////////////////////////

//Основы: типы данных

//ТИП char

class Program
{
 public static void main(String[] args) {
 char ch = '1';
 System.out.println(Character.isDigit(ch)); // true
 ch = 'a';
 System.out.println(Character.isDigit(ch)); // false
 }
}





/////////////////////////////////////////////////////////////////

//Основы: типы данных

//ТИП boolean

public class program {
    public static void main(String[] args) {
    boolean flag1 = 123 <= 234;
    System.out.println(flag1); // true
    boolean flag2 = 123 >= 234 || flag1;
    System.out.println(flag2); // true
    boolean flag3 = flag1 ^ flag2;
    System.out.println(flag3); // false
    }
   }





/////////////////////////////////////////////////////////////////

//Основы: типы данных *Строки не так просты

public class program {
    public static void main(String[] args) {
    String msg ="Hello world";
    System.out.println(msg); // Hello world
    }
   }





/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////

//НЕЯВНАЯ ТИПИЗАЦИЯ

//Неявная типизация

public class program {
 public static void main(String[] args) {
 var a = 123;
 System.out.println(a); // 123
 var d = 123.456;
 System.out.println(d); // 123.456
 }
}





/////////////////////////////////////////////////////////////////

//Неявная типизация

public class program {
    public static void main(String[] args) {
    var a = 123;
    System.out.println(a); // 123
    var d = 123.456;
    System.out.println(d); // 123.456
    System.out.println(getType(a)); // Integer
    System.out.println(getType(d)); // Double
    d = 1022;
    System.out.println(d); // 1022
    //d = "mistake";
    //error: incompatible types:
    //String cannot be converted to double
    }
    static String getType(Object o){
    return o.getClass().getSimpleName();
    }
   }
   


   


/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////

//КЛАССЫ - ОБЁРТКИ

// Примитив - Обертка

int - Integer
short - Short
long - Long
byte - Byte
float - Float
double - Double
char - Character
boolean - Boolean






/////////////////////////////////////////////////////////////////

//Основы: типы данных

class Program
{
 public static void main(String[] args) {
 System.out.println(Integer.MAX_VALUE); // 2147483647 максимальное значение
 System.out.println(Integer.MIN_VALUE); // -2147483648 минимальное значение
 }
}





/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////

//ОПЕРАЦИИ JAVA

Операции Java
● Присваивание: =
● Арифметические: *, /, +, -, %, ++, --
● Операции сравнения: <, >, ==, !=, >=, <=
● Логические операции: ||, &&, ^, !
● Побитовые операции <<, >>, &, |, ^





/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////

//МАССИВЫ

//Одномерные

public class program {
 public static void main(String[] args) {
 int[] arr = new int[10];
 System.out.println(arr.length); // 10
 arr = new int[] { 1, 2, 3, 4, 5 };
 System.out.println(arr.length); // 5
 }
}





/////////////////////////////////////////////////////////////////

//Многомерные

public class program {
 public static void main(String[] args) {
 int[] arr[] = new int[3][5];
 for (int[] line : arr) {
 for (int item : line) {
 System.out.printf("%d ", item);
 }
 System.out.println();
 }
 }
}





/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////

//ПРЕОБРАЗОВАНИЯ 


//Можно

public class program {
 public static void main(String[] args) {
 int i = 123; double d = i;
 System.out.println(i); // 123
 System.out.println(d); // 123.0

 d = 3.1415; i = (int)d;
 System.out.println(d); // 3.1415
 System.out.println(i); // 3

 d = 3.9415; i = (int)d;
 System.out.println(d); // 3.9415
 System.out.println(i); // 3

 byte b = Byte.parseByte("123");
 System.out.println(b); // 123

 b = Byte.parseByte("1234");
 System.out.println(b); // NumberFormatException: Value out of range
 }
}




//НО

class program
{
 public static void main(String[] args) {
 int[] a = new int[10];
 double[] d = a; // ИЗУЧАЕМ ковариантность и контравариантность
 }
}





/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////

//ПОЛУЧЕНИЕ ДАННЫЗ ИЗ МАТЕРИАЛА

//Строки

import java.util.Scanner;
public class program {
 public static void main(String[] args) {
 Scanner iScanner = new Scanner(System.in);
 System.out.printf("name: ");
 String name = iScanner.nextLine();
 System.out.printf("Привет, %s!", name);
 iScanner.close();
 }
}





/////////////////////////////////////////////////////////////////

//Некоторые примитивы

import java.util.Scanner;
public class program {
 public static void main(String[] args) {
 Scanner iScanner = new Scanner(System.in);
 System.out.printf("int a: ");
 int x = iScanner.nextInt();
 System.out.printf("double a: ");
 double y = iScanner.nextDouble();
 System.out.printf("%d + %f = %f", x, y, x + y);
 iScanner.close();
}}






/////////////////////////////////////////////////////////////////

//Проверка на соответствие получаемого типа

import java.util.Scanner;
public class program {
 public static void main(String[] args) {
 Scanner iScanner = new Scanner(System.in);
 System.out.printf("int a: ");
 boolean flag = iScanner.hasNextInt();
 System.out.println(flag);
 int i = iScanner.nextInt();
 System.out.println(i);
 iScanner.close();
 } }



 

/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////

//ФОРМАТИРОВАННЫЙ ВЫВОД

//Форматированный вывод

public class program {
 public static void main(String[] args) {
 int a = 1, b = 2;
 int c = a + b;
 String res = a + " + " + b + " = " + c;
 System.out.println(res);
 }
}





/////////////////////////////////////////////////////////////////

//Форматированный вывод

public class program {
    public static void main(String[] args) {
    int a = 1, b = 2;
    int c = a + b;
    String res = String.format("%d + %d = %d \n", a, b, c);
    System.out.printf("%d + %d = %d \n", a, b, c);
    System.out.println(res);
    }
   }


   



/////////////////////////////////////////////////////////////////

//Виды спецификаторов

// %d: целочисленных значений
// %x: для вывода шестнадцатеричных чисел
// %f: для вывода чисел с плавающей точкой
// %e: для вывода чисел в экспоненциальной форме,
// например, 3.1415e+01
// %c: для вывода одиночного символа
// %s: для вывода строковых значений





/////////////////////////////////////////////////////////////////

//Виды спецификаторов

public class program {
    public static void main(String[] args) {
   
    float pi = 3.1415f;
    System.out.printf("%f\n", pi); // 3,141500
    System.out.printf("%.2f\n", pi); // 3,14
    System.out.printf("%.3f\n", pi); // 3,141
    System.out.printf("%e\n", pi); // 3,141500e+00
    System.out.printf("%.2e\n", pi); // 3,14e+00
    System.out.printf("%.3e\n", pi); // 3,141e+00
    }
   }
    




/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////

//ОБЛАСТЬ ВИДИМОСТИ ПЕРЕМЕННЫХ 

// У переменных существует понятие «область видимости».
// Если переменную объявили внутри некоторого блока фигурных скобок { },
// то снаружи этого блока переменная будет недоступна.

public class program {
 public static void main(String[] args) {
 {
 int i = 123;
 System.out.println(i);
 }
 System.out.println(i); // error: cannot find symbol
 }
}





/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////

//ФУНКЦИИ И МЕТОДЫ

// Функции и методы

// Функции и методы — это технически одно и то же. Функции могут
// не принадлежать классам, а методы принадлежат.

// В java все функции являются методами.
// Описание
// Вызов
// Возвращаемое значение
// Рекурсия





/////////////////////////////////////////////////////////////////

// Функции и методы

public class program {
    static void sayHi() {
    System.out.println("hi!");
    }
    static int sum(int a, int b) {
    return a+b;
    }
    static double factor(int n) {
    if(n==1)return 1;
    return n * factor(n-1);
    }
    public static void main(String[] args) {
    sayHi(); // hi!
    System.out.println(sum(1, 3)); // 4
    System.out.println(factor(5)); // 120.0
    }}
   


    

/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////

//УПРАВЛЯЮЩИЕ КОНСТРУКЦИИ

// Управляющие конструкции:

// условный оператор

public class program {
 public static void main(String[] args) {
 int a = 1;
 int b = 2;
 int c;
 if (a > b) {
 c = a;
 } else {
 c = b;
 }
 System.out.println(c);
 }
}





/////////////////////////////////////////////////////////////////

// Управляющие конструкции:

// условный оператор

public class Program {
    public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int c = 0;
    if (a > b) c = a;
    if (b > a) c = b;
    System.out.println(c);
    }
   }

   



/////////////////////////////////////////////////////////////////

// Управляющие конструкции:

// тернарный оператор  

public class program {
    public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int min = a < b ? a : b;
    System.out.println(min);
    }
   }





/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////

//ОПЕРАТОР ВЫБОРА

//Оператор выбора

import java.util.Scanner;
public class program {
 public static void main(String[] args) {
 int mounth = value;
 String text = "";
 switch (mounth) {
 case 1:
 text = "Autumn";
 break;
// ...
 default:
 text = "mistake";
 break;
 }
 System.out.println(text);
 iScanner.close();
 }
}





/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////

//ЦИКЛЫ


// Цикл — это многократное выполнение одинаковой
// последовательности действий.

// В java доступны следующие циклы:
// ● цикл while;
// ● цикл do while;
// ● цикл for; и его модификация for in





/////////////////////////////////////////////////////////////////

//Цикл while

public class program {
    public static void main(String[] args) {
    int value = 321;
    int count = 0;
    while (value != 0) {
    value /= 10;
    count++;
    }
    System.out.println(count);
    }
   }





/////////////////////////////////////////////////////////////////


//Цикл do while

public class program {
    public static void main(String[] args) {
    int value = 321;
    int count = 0;
    do {
    value /= 10;
    count++;
    } while (value != 0);
    System.out.println(count);
    }
   }





/////////////////////////////////////////////////////////////////


//Циклы

// continue, break

// Операторы для управления циклами — continue и break.
// Выполнение следующей итерации цикла — continue.
// Прерывание текущей итерации цикла — break.
// * ближайшего к оператору





/////////////////////////////////////////////////////////////////

//Оператор цикла for

public class program {
 public static void main(String[] args) {
 int s = 0;
 for (int i = 1; i <= 10; i++) {
 s += i;
 }
 System.out.println(s);
 }
}





/////////////////////////////////////////////////////////////////

//Вложенные циклы

public class program {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++) {
 for (int j = 0; j < 5; j++) {
 System.out.print("* ");
 }
 System.out.println();
 }
 // * * * * *
 // * * * * *
 // * * * * *
 // * * * * *
 // * * * * *
 }
}





/////////////////////////////////////////////////////////////////

//Цикл for :

public class program {
 public static void main(String[] args) {
 int arr[] = new int[10];
 for (int item : arr) {
 System.out.printf("%d ", item);
 }
 System.out.println();
 }
}





/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////

//РАБОТА С ФАЙЛАМИ

//Создание и запись\ дозапись

import java.io.FileWriter;
import java.io.IOException;
public class program {
 public static void main(String[] args) {
 try (FileWriter fw = new FileWriter("file.txt", false)) {
 fw.write("line 1");
 fw.append('\n');
 fw.append('2');
 fw.append('\n');
 fw.write("line 3");
 fw.flush();
 } catch (IOException ex) {
 System.out.println(ex.getMessage());
 }
 } }





/////////////////////////////////////////////////////////////////

//  Работа с файлами

// //  Чтение, Вариант посимвольно

 import java.io.*;
 public class program {
  public static void main(String[] args) throws Exception {
  FileReader fr = new FileReader("file.txt");
  int c;
  while ((c = fr.read()) != -1) {
  char ch = (char) c;
  if (ch == '\n') {
  System.out.print(ch);
  } else {
  System.out.print(ch);
  }
  }
  } } 





/////////////////////////////////////////////////////////////////

//  Работа с файлами

// Вариант построчно

import java.io.*;
public class program {
 public static void main(String[] args) throws Exception {
 BufferedReader br = new BufferedReader(new FileReader("file.txt"));
 String str;
 while ((str = br.readLine()) != null) {
 System.out.printf("== %s ==\n", str);
 }
 br.close();
 }
}





/////////////////////////////////////////////////////////////////

// Задачи для демонстрации

// Задачи для самоконтроля

// 1. Задана натуральная степень k. Сформировать случайным
// образом список коэффициентов (значения от 0 до 100)
// многочлена многочлен степени k.
// *Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0
// 2. Даны два файла, в каждом из которых находится запись
// многочлена. Сформировать файл содержащий сумму
// многочленов.