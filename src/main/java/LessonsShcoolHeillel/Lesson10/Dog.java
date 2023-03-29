package LessonsShcoolHeillel.Lesson10;

public class Dog extends Animals {
    private String name;

    public Dog(String name) {
        this.name = name;
    }


    public void run(int distance) {
        if (distance <= 500) System.out.println(name + " пробежал " + distance + " м.");
        else System.out.println(name + " не пробежит " + distance + " м. Слишком много :)");
    }


    public void swim(int distance) {
        if (distance <= 10) System.out.println(name + " проплыл " + distance + " м.");
        else System.out.println(name + " не проплывет " + distance + " м. Слишком много :)");
    }
}
