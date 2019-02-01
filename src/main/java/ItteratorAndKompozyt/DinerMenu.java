package ItteratorAndKompozyt;

import java.util.Iterator;

public class DinerMenu {
  static final int MASK_LICZBA_ELEMENTÓW = 6;
  int liczbaElemnetów = 0;
  PozycjaMenu[] pozycjeMenu;

  public DinerMenu() {
    pozycjeMenu = new PozycjaMenu[MASK_LICZBA_ELEMENTÓW];

    dodajElement("Wegetariańska kanapka BSP", "(Wegetariański) Boczek z sałata i pomidorem, chleb pszenny pełnoziarnist",
        true, 2.99);
    dodajElement("Kanapka BSP", "Boczek z sałata i pomidorem, chleb pszenny pełnoziarnist",
        false, 2.99);
    dodajElement("Zupa dnia", "Zupa dnia z sałatka z pomidorów", false, 3.29);
    dodajElement("Hot-dog", "Hot-dog z kiszoną kapustą, rzodkiewką i dodtkowym serem", false, 3.05);
  }

  public void dodajElement(String nazwa, String opis, boolean wegetaraiańskie, double cena) {
    PozycjaMenu pozycjaMenu = new PozycjaMenu(nazwa, opis, wegetaraiańskie, cena);
    if (liczbaElemnetów >= MASK_LICZBA_ELEMENTÓW) {
      System.err.println("Niestety menu jest pełne! Nie można dodać nowej pozycji");
    } else {
      pozycjeMenu[liczbaElemnetów] = pozycjaMenu;
      liczbaElemnetów++;
    }
  }

  public Iterator utwórzIterator() {
    return new DinerMenuIterator(pozycjeMenu);
  }
}
