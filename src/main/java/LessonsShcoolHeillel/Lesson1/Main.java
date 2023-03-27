package LessonsShcoolHeillel.Lesson1;

public class Main {
    public static void main(String[] args) {
        /*
        1. Создать пустой проект в IntelliJ IDEA, создать класс FirstLesson и прописать в нем метод main.
        2. Запустить программу и убедиться, что холостой запуск прошел успешно.
        3. Напечатать рисунок квадрата.
        4. Написать выражение (a + b) * 3. Сохранить его результат в переменную. Значение переменной вывести в консоль.
        5. Вывести в консоль свое имя с приветствием и с новой строки возраст.
            "Привет, меня зовут ТУТ_ИМЯ!"
            "Мне ТУТ_ВОЗРАСТ лет."
        6. Создать переменные типов данных byte, short, int, long и присвоить им произвольные значения.

        ВАЖНО!
        Все задания делать в методе public static void main*/

        System.out.println(" ________");
        System.out.println("|        |");
        System.out.println("|        |");
        System.out.println("|        |");
        System.out.println(" --------");
        int a = 5;
        int b = 4;
        int resul = (a + b) * 3;
        System.out.println(resul);
        String name = "Viktor";
        int age = 28;
        System.out.println("Привет, меня зовут " + name + "!");
        System.out.println("Мне " + age + "лет.");

        byte byte_num = 8;
        short short_num = 120;
        int int_num = 1234535323;
        long long_num = 120312459230125021l;
    }
}