package Ducks;

import SuperClasses.Duck;
import SuperClasses.FlyingInterface.IHaveWingsSoIFly;
import SuperClasses.QuackInterface.Quack;

public class WildDuck extends Duck {


    public WildDuck() {
     super(new IHaveWingsSoIFly(), new Quack());
    }
}
