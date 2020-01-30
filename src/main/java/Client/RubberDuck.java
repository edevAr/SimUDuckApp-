package Client;

import DuckBehaviors.FlyBehavior.FlyNoWay;
import DuckBehaviors.QuackBehavior.Quack;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("looks like a rubberduck");
    }
}
