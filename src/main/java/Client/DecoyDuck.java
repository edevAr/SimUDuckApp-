package Client;

import DuckBehaviors.FlyBehavior.FlyNoWay;
import DuckBehaviors.QuackBehavior.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("decoy duck!!!");
    }
}
