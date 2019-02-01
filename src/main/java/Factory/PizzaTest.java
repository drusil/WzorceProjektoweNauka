package Factory;

public class PizzaTest {

    public static void main(String[] args) {
        Pizzeria włoska = new WłoskaPizzeria();
        Pizzeria amerykańska = new AmaerykańskaPizzeria();

        Pizza pizza = włoska.zamówPizze("serowa");
        System.out.println("Eryk zamówił: " + pizza.getName());

        pizza = amerykańska.zamówPizze("serowa");
        System.out.println("Jacek zamówił: " + pizza.getName());
    }
}
