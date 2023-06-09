package LessonsShcoolHeillel.Lesson10;

public class Main {
    public static void main(String[] args) {
        /*1. Создать пустой проект в IntelliJ

          2. Создать классы Собака и Кот с наследованием от класса Животное.

          3. Все животные могут бежать и плыть.
          В качестве параметра каждому методу передается длина препятствия.
          Результатом выполнения действия будет печать в консоль.
          (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');

          4. У каждого животного есть ограничения на действия
          (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).

          5. * Добавить подсчет созданных котов, собак и животных.*/

        Dog dogBobik = new Dog("Bobik");
        dogBobik.run(100);
        dogBobik.swim(20);
        Cat catKisyun = new Cat("Kisyun");
        catKisyun.run(255);
        catKisyun.swim(15);
    }
}
