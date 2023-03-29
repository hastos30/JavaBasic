package LessonsShcoolHeillel.Lesson11;

public class Cat {
    private String name;
    private final int APPETIT = 15;
    private boolean Satiety = false;

    Cat(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", Satiety=" + Satiety +
                '}';
    }

    public void eat(Plate plate) {
        if (plate.getFood() - APPETIT > 0) {
            System.out.println(toString());
            plate.decreaseFood(APPETIT);
            Satiety = true;
            System.out.println(name + " успешно поел :) \n" + toString());
            System.out.println("Количество еды в тарелке после приема пищи составляет " + plate.getFood() + "%");
            System.out.println("********************************************************************");
        } else {
            Satiety = false;
            System.out.println(toString());
            System.out.println("Тарелка пуста");
        }
    }
}
