package Decorator;


public class StarCaffeSpecial extends Drink {

  public StarCaffeSpecial() {
    discription = "Star Special Coffee";
  }

  @Override
  public double cost() {
    return 0.89;
  }
}
