package Client;

import DuckBehaviors.FlyBehavior.FlyWithWings;
import DuckBehaviors.QuackBehavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I am a real Mallard duck");
    }
}
