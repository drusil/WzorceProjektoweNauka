package Factory;

public class AmaerykańskaPizzeria extends Pizzeria {

  @Override
  Pizza createPizza(String type) {
    if (type.equals("serowa")) return new AmerykańskaSerowaPizza();
    else if (type.equals("wegetariańska")) return new AmerykańskaWegetariańskaPizza();
    else if (type.equals("owoce morza")) return new AmerykańskaOwoceMorzaPizza();
    else if (type.equals("peperoni")) return new AmerykańskaPeperioniPizza();
    else return null;

  }
}
