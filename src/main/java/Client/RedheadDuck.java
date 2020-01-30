package Client;

import DuckBehaviors.FlyBehavior.FlyWithWings;
import DuckBehaviors.QuackBehavior.Quack;

public class RedheadDuck extends Duck{

    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("looks like a redhead");
    }
}
