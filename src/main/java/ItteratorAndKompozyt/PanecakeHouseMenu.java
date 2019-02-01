package ItteratorAndKompozyt;

import java.util.ArrayList;
import java.util.Iterator;


public class PanecakeHouseMenu {
  ArrayList<PozycjaMenu> pozycjeMenu;

  public PanecakeHouseMenu() {
    pozycjeMenu = new ArrayList<>();

    dodajElemnet("Śniadanie naleśnikowe K&B", "Nalesniki z jajecznicą i tostem", true, 2.99);
    dodajElemnet("Śniadanie nalesnikowe zwykłe", "Nalesniki z jajkiem sadzonym i kiełbasą", false, 2.99);
    dodajElemnet("Naleśniki z jagodami", "Naleśniki ze swieżymi jagodami", true, 3.49);
    dodajElemnet("Wafle nadziewane", "Wafle z jagodami lub truskawkami", true, 3.59);
  }

  public void dodajElemnet(String nazwa, String opis, boolean wegetariańskie, double cena) {
    PozycjaMenu pozycjaMenu = new PozycjaMenu(nazwa, opis, wegetariańskie, cena);
    pozycjeMenu.add(pozycjaMenu);
  }

  public Iterator utwórzIterator() {
    return new PanecakeHouseIterator(pozycjeMenu);
  }


}
