package Duck.Ducks;

import Duck.SuperClasses.Duck;
import Duck.SuperClasses.FlyingInterface.IHaveWingsSoIFly;
import Duck.SuperClasses.QuackInterface.Quack;

public class WildDuck extends Duck {


  public WildDuck() {
    super(new IHaveWingsSoIFly(), new Quack());
  }
}
