package LessonsShcoolHeillel.Lesson12;

public class Wall  implements Obstacle{
    @Override
    public void Obstacle(Movement movement) {
        movement.jump();
    }
}
