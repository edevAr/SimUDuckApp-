import DuckBehaviors.FlyNoWay;
import DuckBehaviors.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I am a model duck");
    }
}
