package LessonsShcoolHeillel.Lesson2;

public class Main {
    public static void main(String[] args) {
        /*
        1. Создать пустой проект в IntelliJ IDEA
        2. Создать метод printWords. При вызове должен напечатать в слова, каждое с новой строки: Cat, Dog, Lion
        3. Создать метод calcSum, в теле которого объявите две int переменные a и b. Присвоить значениям произвольные значения.
           Просуммировать значения переменных и вывести в консоль.
        4. Создать метод вычисления периметра. Все необходимые значения для вычисления принимаются в качестве параметров (аргументов) метода. Функция должна возвращать результат вычисления.
        5. Создать метод для выведения информации о человеке (см. ниже). Данные о человеке принимаются в качестве параметров (аргументов) метода,
            Пример:
            ФИО: Тут данные
            Возраст: Тут данные
            Страна происхождения: Тут данные
        6. ** Создать метод power, который принимает два параметра типа int и производит первое число в степень второго. После вычисления метод должен возвращать результат. Использовать утильный класс Math.pow(a, b)
        */

    }

    static void printWords() {
        System.out.println("Cat");
        System.out.println("Dog");
        System.out.println("Lion");
    }

    static void calcSum() {
        int a = 10, b = 15;
        int sum = a + b;
        System.out.println(" a + b " + sum);
    }

    static int perimeterSquare(int width, int length) {
        return (width + length) * 2;
    }

    static void informationOfHuman(String FIO, int age, String country) {
        System.out.println("ФИО: " + FIO);
        System.out.println("Возраст: " + age);
        System.out.println("Страна происхождения: " + country);
    }

    static int power(int num1, int num2) {
        return (int)Math.pow(num1, num2);
    }
}
