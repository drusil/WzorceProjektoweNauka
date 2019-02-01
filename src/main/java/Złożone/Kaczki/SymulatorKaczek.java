package Złożone.Kaczki;

public class SymulatorKaczek {
  public static void main(String[] args) {
    SymulatorKaczek symulator = new SymulatorKaczek();
    AbstarkcyjnaFabrykaKaczek kaczaFabryka = new FabrykaKaczekZLicznikiem();
    symulator.uruchom(kaczaFabryka);
  }

  private void uruchom(AbstarkcyjnaFabrykaKaczek kaczaFabryka) {
    Kwacząca dzikaKaczka = kaczaFabryka.utwórzDzikaKaczka();
    Kwacząca płaskonosaKaczka = kaczaFabryka.utwórzPłaskonosaKaczka();
    Kwacząca wabikKaczka = kaczaFabryka.utwórzWabikKaczka();
    Kwacząca gumowaKaczka = kaczaFabryka.utwórzGumowaKaczka();
    Kwacząca gęś = new GęsAdapter(new Gęś());

    System.out.println("\n Symulator Kaczek \n");

    Stado stadoKaczek = new Stado();

    stadoKaczek.dodaj(dzikaKaczka);
    stadoKaczek.dodaj(płaskonosaKaczka);
    stadoKaczek.dodaj(wabikKaczka);
    stadoKaczek.dodaj(gumowaKaczka);
    stadoKaczek.dodaj(gęś);

    Stado stadoDzikichKaczek = new Stado();

    Kwacząca dzikaKaczkaJeden = kaczaFabryka.utwórzDzikaKaczka();
    Kwacząca dzikaKaczkaDwa = kaczaFabryka.utwórzDzikaKaczka();
    Kwacząca dzikaKaczkaTrzy = kaczaFabryka.utwórzDzikaKaczka();
    Kwacząca dzikaKaczkaCztery = kaczaFabryka.utwórzDzikaKaczka();

    stadoDzikichKaczek.dodaj(dzikaKaczkaJeden);
    stadoDzikichKaczek.dodaj(dzikaKaczkaDwa);
    stadoDzikichKaczek.dodaj(dzikaKaczkaTrzy);
    stadoDzikichKaczek.dodaj(dzikaKaczkaCztery);

    stadoKaczek.dodaj(stadoDzikichKaczek);

    Kwakolog kwakolog = new Kwakolog();
    stadoKaczek.zarejstrujObserwatora(kwakolog);

    System.out.println("\n Symulator Kaczek: symulacja całego stada");
    uruchom(stadoKaczek);

    System.out.println("\n Kaczki kwaknęły " + KwakLicznik.getLicznikKwaknięć() + " razy");

    System.out.println("\n Symulator Kaczek: Symualcja stada dzikich kaczek");
    uruchom(stadoDzikichKaczek);

    System.out.println("\n Kaczki kwaknęły " + KwakLicznik.getLicznikKwaknięć() + " razy");
  }

  private void uruchom(Kwacząca kaczka) {
    kaczka.kwacz();
  }
}
