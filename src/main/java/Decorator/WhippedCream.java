package Decorator;


public class WhippedCream extends DecoratorIngredient {

  Drink drink;

  public WhippedCream(Drink drink) {
    this.drink = drink;
  }

  @Override
  public String getDiscription() {
    return drink.getDiscription() + ", Whipped Cream";
  }

  @Override
  public double cost() {
    return drink.cost() + 0.10;
  }
}
