public class StarCafe {

    public static void main(String[] args) {
        Drink drink = new Espresso();
        displayOrder(drink);

        Drink drink2 = new DarkRoastCoffee();
        drink2 = new Chocolate(drink2);
        drink2 = new Chocolate(drink2);
        drink2 = new WhippedCream(drink2);
        displayOrder(drink2);

        Drink drink3 = new StarCaffeSpecial();
        drink3 = new SoyMilk(drink3);
        drink3 = new Chocolate(drink3);
        drink3 = new WhippedCream(drink3);
        displayOrder(drink3);
    }

    public static void displayOrder (Drink order){
        System.out.println(order.getDiscription() + " "
                           + order.cost() + "$");

    }
}
