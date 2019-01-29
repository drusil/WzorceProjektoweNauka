package Ducks;

import SuperClasses.Duck;
import SuperClasses.FlyingInterface.FlyWithRocketEngine;
import SuperClasses.FlyingInterface.FlyingInterface;
import SuperClasses.QuackInterface.QuackInterface;
import SuperClasses.QuackInterface.Silent;

public class ModelDuck extends Duck {
    public ModelDuck() {
        super(new FlyWithRocketEngine(), new Silent());
    }
}
