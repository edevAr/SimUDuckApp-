import DuckBehaviors.FlyBehavior;
import DuckBehaviors.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performanceQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("swiming!!!");
    }
    public abstract void display();
}
