package ItteratorAndKompozyt;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuSkładnik {
  ArrayList menuSkładniki = new ArrayList();
  String opis;
  String nazwa;

  public Menu(String nazwa, String opis) {
    this.opis = opis;
    this.nazwa = nazwa;
  }

  @Override
  public void dodaj(MenuSkładnik menuSkładnik) {
    menuSkładniki.add(menuSkładnik);
  }

  @Override
  public void usuń(MenuSkładnik menuSkładnik) {
    menuSkładniki.remove(menuSkładnik);
  }

  @Override
  public MenuSkładnik pobierzPotomek(int i) {
    return (MenuSkładnik) menuSkładniki.get(i);
  }


  public String pobierzNazwa() {
    return nazwa;
  }

  public String pobierzOpis() {
    return opis;
  }

  public void drukuj() {
    System.out.print("\n" + pobierzNazwa());
    System.out.println(", " + pobierzOpis());
    System.out.println("-----------------------");

    Iterator iterator = menuSkładniki.iterator();
    while (iterator.hasNext()) {
      MenuSkładnik menuSkładnik = (MenuSkładnik) iterator.next();
      menuSkładnik.drukuj();
    }


  }

  public Iterator utwórzIterator() {
    return new IteratorKompozytu(menuSkładniki.iterator());
  }
}
