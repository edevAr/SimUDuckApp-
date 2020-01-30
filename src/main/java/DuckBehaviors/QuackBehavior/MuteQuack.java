package DuckBehaviors.QuackBehavior;

import DuckBehaviors.QuackBehavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
