public class Chocolate extends DecoratorIngredient {

    Drink drink;

    public Chocolate(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDiscription() {
        return drink.getDiscription() + ", Chocolate";
    }

    @Override
    public double cost() {
        return drink.cost() + 0.20;
    }
}
