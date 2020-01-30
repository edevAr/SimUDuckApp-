public class RubberDuck extends Duck {

    @Override
    public void quack() {
        System.out.println("I don't cuak!!!");
    }

    @Override
    public void fly() {
    }

    public void display() {
        System.out.println("looks like a rubberduck");
    }
}
