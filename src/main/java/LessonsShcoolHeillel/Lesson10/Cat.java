package LessonsShcoolHeillel.Lesson10;

public class Cat extends Animals {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void run(int distance) {
        if (distance <= 200) System.out.println(name + " пробежал " + distance + " м.");
        else System.out.println(name + " не пробежит " + distance + " м. Слишком много :)");
    }

    public void swim(int distance) {
        System.out.println(name + " не умеет плавать! :С ");
    }
}
