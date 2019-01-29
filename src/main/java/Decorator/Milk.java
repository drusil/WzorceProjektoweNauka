public class Milk extends DecoratorIngredient {

    Drink drink;

    public Milk(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDiscription() {
        return drink.getDiscription() + ", Milk";
    }

    @Override
    public double cost() {
        return drink.cost() + 0.10;
    }
}
