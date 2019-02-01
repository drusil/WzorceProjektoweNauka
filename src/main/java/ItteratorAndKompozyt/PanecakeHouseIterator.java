package ItteratorAndKompozyt;

import java.util.ArrayList;
import java.util.Iterator;

public class PanecakeHouseIterator implements Iterator {
  ArrayList<PozycjaMenu> elementy;
  int pozycja = 0;

  public PanecakeHouseIterator(ArrayList<PozycjaMenu> elementy) {
    this.elementy = elementy;
  }

  @Override
  public boolean hasNext() {
    if (pozycja < elementy.size()) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public Object next() {
    PozycjaMenu pozycjaMenu = elementy.get(pozycja);
    pozycja++;
    return pozycjaMenu;
  }
}
