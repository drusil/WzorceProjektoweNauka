package Duck.Ducks;


import Duck.SuperClasses.Duck;
import Duck.SuperClasses.FlyingInterface.FlyWithRocketEngine;
import Duck.SuperClasses.QuackInterface.Silent;

public class ModelDuck extends Duck {
  public ModelDuck() {
    super(new FlyWithRocketEngine(), new Silent());
  }
}
