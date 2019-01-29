public abstract class Pizzeria {

    public Pizza zamówPizze(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.przygotowanie();
        pizza.pieczenie();
        pizza.krojenie();
        pizza.pakowania();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
