package Decorator;

public class DarkRoastCoffee extends Drink {
  public DarkRoastCoffee() {
    discription = "Dark Roast Coffee";
  }

  @Override
  public double cost() {
    return 0.99;
  }
}
