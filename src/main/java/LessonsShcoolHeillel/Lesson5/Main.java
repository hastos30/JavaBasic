package LessonsShcoolHeillel.Lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0*/

        int[] numArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(numArray));
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == 1) {
                numArray[i] = 0;
            } else {
                numArray[i] = 1;
            }
        }

        for (int a : numArray) {
            System.out.print(a);
        }
        System.out.println();

        /*Задать пустой целочисленный массив длиной 100.
        С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100*/

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.printf(array[i] + " ");
        }
        System.out.println();

        /*Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2*/

        int[] newArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] <= 6) {
                newArray[i] = newArray[i] * 2;
            }
            System.out.print(newArray[i] + " ");
        }
        System.out.println();

        /*Задать одномерный массив и найти в нем минимальный и максимальный элементы*/
        int[] arrayMinMax = {1, 123, 4, 2, 1, 45, 1, 23, 123, 412, 2};

        for (int i = 0; i < arrayMinMax.length - 1; i++) {
            for (int j = arrayMinMax.length - 1; j > i; j--) {
                if (arrayMinMax[j - 1] > arrayMinMax[j]) {
                    int num = arrayMinMax[j - 1];
                    arrayMinMax[j - 1] = arrayMinMax[j];
                    arrayMinMax[j] = num;
                }
            }
        }
        for (int a : arrayMinMax) {
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("Минимальное зачения массива под индексом [0] = " + arrayMinMax[0]);
        System.out.println("Максимальное зачения массива под индексом [Length - 1] = "
                + arrayMinMax[arrayMinMax.length - 1]);

        /*Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        (можно только одну из диагоналей, если обе сложно).
        Определить элементы одной из диагоналей можно по следующему принципу:
        индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n]*/

        int[][] arrayDiagram = new int[5][5];
        for (int i = 0; i < arrayDiagram.length; i++) {
            for (int j = 0, x = arrayDiagram[i].length - 1; j < arrayDiagram[i].length; j++, x--) {
                if (i == j || i == x) arrayDiagram[i][j] = 1;
                else arrayDiagram[i][j] = 0;
                System.out.print(arrayDiagram[i][j] + " ");
            }
            System.out.println();
        }

    }
}
