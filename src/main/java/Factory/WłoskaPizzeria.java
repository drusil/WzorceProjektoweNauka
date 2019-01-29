public class WłoskaPizzeria extends Pizzeria {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("serowa")) return new WłoskaSerowaPizza();
        else if (type.equals("wegetariańska")) return new WłoskaWegetariańskaPizza();
        else if (type.equals("owoce morza")) return new WłoskaOwoceMorzaPizza();
        else if (type.equals("peperoni")) return new WłoskaPeperioniPizza();
        else return null;

    }
}
