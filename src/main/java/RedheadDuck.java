import DuckBehaviors.FlyBehavior;
import DuckBehaviors.QuackBehavior;

public class RedheadDuck extends Duck implements FlyBehavior, QuackBehavior {

    public void display() {
        System.out.println("looks like a redhead");
    }

    public void fly() {

    }

    public void quack() {

    }
}
