package LessonsShcoolHeillel.Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*1. Создать пустой проект в IntelliJ IDEA*/
        /*2. Создать метод, которому в качестве аргументов передается строка и число,
        метод должен отпечатать в консоль указанную строку, указанное количество раз. (выполнять при помощи циклов).
        Число-количество вводится из консоли и затем значение передается в качестве аргумента в метод.
        Например: int quantity = .... doTaskN("Hello", quantity);*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку которая будет повторяться: ");
        String str = scanner.nextLine();
        System.out.println("Введите количество повторений строки: ");
        int iteration = scanner.nextInt();
        methodPrint(str, iteration);
        System.out.println();
        /*3. Создать метод и в нем с помощью цикла вывести в консоль значения в диапазоне от 1 до 100;*/
        /*4. Создать метод и в нем с помощью цикла вывести в консоль значения кратные числу 2 (два) в диапазоне от 0 до 100. Например: 0, 2, 4 ... 100;*/
        /*5. Создать метод, который в качестве параметра принимает два целых числа (A и В).
        Число "А" играет роль максимально  возможного числа (включительно).
        Необходимо, 20 раз сгенерировать случайное положительное число не превышающее значение числа "A".
        Число "В" - искомое, которое необходимо найти среди случайно сгенерированных чисел.
        Подсчитать и вывести в консоль, сколько раз число "В" встретилось при генерации случайных чисел.
            Например: doTaskN(10, 4);
                1
                0
                4
                3
                ..
                4
                10
                "Digit 4 has occurred 2 times"*/
        System.out.println("Введите максимальное число для регенирации случайных 20 чисел: ");
        int maxNum = scanner.nextInt();
        System.out.println("Введите искомое число, которое хотите отследить, и узнать количество повторений: ");
        int number = scanner.nextInt();
        doTaskN(maxNum, number);

        System.out.println();

        /*6. Создать метод, который будет делать проверку на возможность прохождения экзамена по вождению.
        При старте клиенту предлагается ввести свое имя, затем возраст.
        Если возраст менее 18 (восемнадцати) лет,
        то происходит выход из функции с возвращением значения false с предварительным сообщением
        "Sorry, Mr(s) ТУТ_ИМЯ your age is ТУТ_ВОЗРАСТ and you are too young :(",
        иначе выводится сообщение "Congratulations!!! Please take a sit and let's pass it." и возвращается true.
        Важно: ТУТ_ИМЯ и ТУТ_ВОЗРАСТ должны быть заменены значениями введенными из консоли.*/
        System.out.println("Введите свои данные для проверки!");
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();
        student(name, age);

        System.out.println();

    }

    static void methodPrint(String str, int iteration) {
        for (int i = 0; i < iteration; i++) {
            System.out.println(str);
        }
    }

    static void methodNumber() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    static void methodMultipleTwo() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    static void doTaskN(int a, int b) {
        Random random = new Random();
        int count = 0;
        for (int i = 0; i <= 20; i++) {
            int randomNumber = random.nextInt(0, a);
            System.out.println(randomNumber);
            if (randomNumber == b) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Digit " + b + " has occurred " + count + " times");

    }

    static boolean student(String name, int age) {
        if (age < 18) {
            System.out.println("Sorry, Mr(s) " + name + " your age is " + age + " and you are too young :(");
            return false;
        } else {
            System.out.println("Congratulation!!! Please take a sit and let`s pass it.");
            return true;
        }
    }

}
