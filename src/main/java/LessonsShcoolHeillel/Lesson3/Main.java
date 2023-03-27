package LessonsShcoolHeillel.Lesson3;

public class Main {
    public static void main(String[] args) {
        /*
        1. Создать пустой проект в IntelliJ IDEA
        2. Написать метод, принимающий на вход два целых числа и проверяющий,
        что их сумма лежит в пределах от 10 до 20 (включительно),
        если да – вернуть true, в противном случае – false.
        3. Написать метод, которому в качестве параметра передается целое число,
        метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        Замечание: ноль считаем положительным числом.
        4. Написать метод, которому в качестве параметра передается целое число.
        Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        5. Написать метод, которому в качестве аргументов передается строка и число,
        метод должен отпечатать в консоль указанную строку, указанное количество раз;
        6. * Написать метод, который определяет, является ли год високосным,
        и возвращает boolean (високосный - true, не високосный - false).
        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        */
    }

    static boolean methodTrueFalse(int num1, int num2) {
        int sum = num1 + num2;
        return sum <= 20 && sum >= 10;
    }

    static void methodNumber(int num) {
        if (num < 0) System.out.println("Число" + num + " отрицательное!");
        else System.out.println("Число" + num + " положительное!");
    }


    static boolean methodNumberBool(int num){
        return num >= 0;
    }

    static void methodPrint(String str, int iteration){
        for(int i = 0; i < iteration; i++){
            System.out.println(str);
        }
    }

    static boolean isLeapYearBool(int x) {
        return x % 4 == 0 && x % 100 != 0 || x % 400 == 0;
    }
}
