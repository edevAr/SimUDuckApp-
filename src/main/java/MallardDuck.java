import DuckBehaviors.FlyBehavior;
import DuckBehaviors.QuackBehavior;

public class MallardDuck extends Duck implements FlyBehavior, QuackBehavior {

    public void display() {
        System.out.println("looks like a mallard");
    }

    public void fly() {

    }

    public void quack() {

    }
}
