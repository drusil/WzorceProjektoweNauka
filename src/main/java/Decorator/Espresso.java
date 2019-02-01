package Decorator;

public class Espresso extends Drink {

  public Espresso() {
    discription = "Espresso Coffee";
  }

  @Override
  public double cost() {
    return 1.99;
  }
}
