package LessonsShcoolHeillel.Lesson13;

public class Recording implements Person{
    private String name;
    private String numberPhone;
    public Recording(String name, String numberPhone) {
        this.name = name;
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }
}
