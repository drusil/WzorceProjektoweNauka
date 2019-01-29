public class MenuTest {
    public static void main(String[] args) {
       MenuSkładnik pancakeHouseMenu = new Menu("MENU PANCAKE MENU", "Śniadaia");
       MenuSkładnik dinerMenu = new Menu("MENU RESTARUACJI DINER", "Lunch");
       MenuSkładnik uJackaMenu = new Menu("MENU U JACKA", "Obiady");
       MenuSkładnik deseryMenu = new Menu("MENU DESERÓW", "Desery");

       MenuSkładnik wszystkieMenu = new Menu("WSZYSTKIE MENU","połączone menu");

       wszystkieMenu.dodaj(pancakeHouseMenu);
       wszystkieMenu.dodaj(deseryMenu);
       wszystkieMenu.dodaj(uJackaMenu);

       dinerMenu.dodaj(new PozycjaMenu("Wegetariańska kanapka BSP","(Wegetariański) Boczek z sałata i pomidorem, chleb pszenny pełnoziarnist",
               true,2.99));
       dinerMenu.dodaj(new PozycjaMenu("Kanapka BSP","Boczek z sałata i pomidorem, chleb pszenny pełnoziarnist",
               false,2.99));
       dinerMenu.dodaj(new PozycjaMenu("Zupa dnia", "Zupa dnia z sałatka z pomidorów", false,3.29));
       dinerMenu.dodaj(new PozycjaMenu("Hot-dog", "Hot-dog z kiszoną kapustą, rzodkiewką i dodtkowym serem", false,3.05));
       dinerMenu.dodaj(deseryMenu);

       pancakeHouseMenu.dodaj(new PozycjaMenu("Śniadanie naleśnikowe K&B", "Nalesniki z jajecznicą i tostem", true,2.99));
       pancakeHouseMenu.dodaj(new PozycjaMenu("Śniadanie nalesnikowe zwykłe", "Nalesniki z jajkiem sadzonym i kiełbasą", false,2.99));
       pancakeHouseMenu.dodaj(new PozycjaMenu("Naleśniki z jagodami", "Naleśniki ze swieżymi jagodami", true,3.49));
       pancakeHouseMenu.dodaj(new PozycjaMenu("Wafle nadziewane","Wafle z jagodami lub truskawkami", true,3.59));

       uJackaMenu.dodaj(new PozycjaMenu("Kanapka wegetaraiańska z frytkami",
               "Kanapka wegetariańska z sałatą i pomidorem, frytki",true,3.99));
       uJackaMenu.dodaj(new PozycjaMenu("Zupa dania","Filiżanka zupy dnia,sałatka",false,3.69));
       uJackaMenu.dodaj(new PozycjaMenu("Burrito","Duze burrito z fasolą, sosem salsa i awakado",true,4.29));

       deseryMenu.dodaj(new PozycjaMenu("Szarlotka", "Szarlotka z lodami waniliowymi", true,1.59));

       Kelnerka kelnerka = new Kelnerka(wszystkieMenu);
       kelnerka.drukujMenuWegetariańskie();

    }
}
