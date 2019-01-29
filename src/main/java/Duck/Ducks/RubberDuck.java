package Ducks;

import SuperClasses.Duck;
import SuperClasses.FlyingInterface.ICantFly;
import SuperClasses.QuackInterface.Squick;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new ICantFly(), new Squick());
    }
}
