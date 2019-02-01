package Duck.Ducks;

import Duck.SuperClasses.FlyingInterface.ICantFly;
import Duck.SuperClasses.Duck;
import Duck.SuperClasses.QuackInterface.Squick;

public class RubberDuck extends Duck {

  public RubberDuck() {
    super(new ICantFly(), new Squick());
  }
}
