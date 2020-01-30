import Client.Duck;
import Client.MallardDuck;
import Client.ModelDuck;
import DuckBehaviors.QuackBehavior.FlyRocketPowered;

public class Main {
    public static void main(String[]arg){
        System.out.println("=======SIMUDUCK=======");

        Duck mallardDuck = new MallardDuck();
        mallardDuck.performanceQuack();
        mallardDuck.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
