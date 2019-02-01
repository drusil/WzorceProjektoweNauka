package Złożone.Kaczki;

public class Kwakolog implements Obserwator {
  @Override
  public void aktualizuj(KwakObserwowany kaczka) {
    System.out.println("Kwakolog : " + kaczka + " kwaknęła");
  }
}
