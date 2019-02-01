package Factory;

public class AmerykańskaSerowaPizza extends Pizza {
    public AmerykańskaSerowaPizza() {
        name = "Amerykańska Pizza Serowa";
        dought = "Extra grube, crupiące ciasto";
        sauce = " Sos z pomidorów śliwkowych";

        ingredients.add("Grubo tarty ser Mozzarella");
    }

    @Override
    void krojenie(){
        System.out.println("Krojenie pizzy na kwadratowe kawałki");
    }
}
