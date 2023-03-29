package LessonsShcoolHeillel.Lesson11;

public class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }
    public int getFood() {
        return food;
    }
    public void decreaseFood(int size) {
        System.out.println("Количество еды в тарелке составляло " + food + "%");
        food-=size;
    }

    public void increaseFood(int size){
        if(food-size > 0) food-=size;
        else System.out.println("Тарелка и так пуста!");
    }
}
