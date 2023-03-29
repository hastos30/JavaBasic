package LessonsShcoolHeillel.Lesson12;

public class Human implements Movement{
    @Override
    public void run() {
        System.out.println("Человек бежит!");
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгает!");
    }
}
