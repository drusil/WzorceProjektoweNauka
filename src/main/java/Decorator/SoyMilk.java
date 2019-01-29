public class SoyMilk extends DecoratorIngredient {

    Drink drink;

    public SoyMilk(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDiscription() {
        return drink.getDiscription() + ", Soy Milk";
    }

    @Override
    public double cost() {
        return drink.cost() + 0.15;
    }
}
