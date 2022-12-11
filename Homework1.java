package Homework1;

import java.util.Random;
public class Homework1 {
    public static void main(String[] args) {
        System.out.print("задание 1: ");
        System.out.println(sumChecker(5,10));                  // call task 1.
        System.out.print("задание 2: ");
        positiveCheckerPrint(-5);                       // call task 2.
        System.out.print("задание 3: ");
        System.out.println(positiveChecker(-5));        // call task 3.
        System.out.print("задание 4: ");
        stringRepeater("Один", 10);                     // call task 4.
        System.out.print("задание 5: ");
        System.out.println(leapYearChecker(1984));              // call task 5
        System.out.print("задание 6: ");
        for (int values : binarySwapper(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0})) {   // call task 6.
            System.out.printf("%d ", values);
        }
        System.out.print("\n");
        System.out.print("задание 7: ");
        for (int values : arrayFiller()) {                      // call task 7.
            System.out.printf("%d ", values);
        }
        System.out.print("\n");
        System.out.print("задание 8: ");
        for (int values : multiplyConditional(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})) {   // call task 8.
            System.out.printf("%d ", values);
        }
        System.out.print("\n");
        System.out.print("задание 9: \n");
        for (int[] rows : arrayDiagFiller()) {                   // call task 9.
            for (int values : rows){
                System.out.printf("%d ", values);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        System.out.print("задание 10: ");
        for (int values : arrayBuilder(5, 20)) {    // call task 10.
            System.out.printf("%d ", values);
        }
        System.out.print("\n");
        System.out.print("задание 11: ");
        arrayMinMaxFinder();                                      // call task 11.
    }

//  1. Написать метод, принимающий на вход два целых числа и проверяющий,
//  что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
//  в противном случае – false.

    public static boolean sumChecker(int number1, int number2){
        return number1 + number2 >= 10 && number1 + number2 <= 20;
    }

//  2. Написать метод, которому в качестве параметра передается целое число,
//  метод должен напечатать в консоль, положительное ли число передали или отрицательное.
//  Замечание: ноль считаем положительным числом.

    public static void positiveCheckerPrint(int number){
        if (number >= 0){
            System.out.printf("Число %d положительное\n", number);
        } else {
            System.out.printf("Число %d отрицательное\n", number);
        }
    }

//  3. Написать метод, которому в качестве параметра передается целое число.
//  Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean positiveChecker(int number){
        return number >= 0;
    }

//  4. Написать метод, которому в качестве аргументов передается строка и число,
//  метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static void stringRepeater(String str, int rep){
        while(rep > 0){
            System.out.print(str);
            rep--;
        }
        System.out.print("\n");
    }

//  5. Написать метод, который определяет, является ли год високосным,
//  и возвращает boolean (високосный - true, не високосный - false).
//  Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static boolean leapYearChecker(int year){
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

//  6. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//  С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static int[] binarySwapper(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0){
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return array;
    }

//  7. Задать пустой целочисленный массив длиной 100.
//  С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

        public static int[] arrayFiller(){
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }
//  8. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
//  и числа меньшие 6 умножить на 2;

    public static int[] multiplyConditional(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        return array;
    }

//  9. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//  и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
//  если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
//  индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    public static int[][] arrayDiagFiller(){
        int[][] array = new int[10][10];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    if (i == j || i == array[0].length - 1 - j){
                        array[i][j] = 1;
                    }
                }
            }
        return array;
    }

//  10. Написать метод, принимающий на вход два аргумента: len и initialValue,
//  и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

    public static int[] arrayBuilder(int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

//  11. Задать одномерный массив и найти в нем минимальный и максимальный элементы.

    public static void arrayMinMaxFinder(){
        int[] array = new int[10];
        Random rd = new Random();
        int minValue = array[0];
        int maxValue = array[0];
        int maxBound = 100;
        int minBound = -100;
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(maxBound - minBound) + minBound;
            if(array[i] > maxValue){maxValue = array[i];}
            if(array[i] < minValue){minValue = array[i];}
            System.out.printf("%d ", array[i]);
        }
        System.out.printf("\nМинимальное значение массива: %d", minValue);
        System.out.printf("\nМаксимальное значение массива: %d", maxValue);
    }


}

