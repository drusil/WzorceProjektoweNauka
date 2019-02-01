package Stan.AutomanZeStanem;

public class AutomatSprzedający {
  Stan stanBrakGum;
  Stan stanNieMaMonety;
  Stan stanJestMoneta;
  Stan stanGumaSprzedana;
  Stan stanWygrana;


  String lokalizacja;
  Stan stan = stanBrakGum;
  int liczbaGum = 0;


  public String getLokalizacja() {
    return lokalizacja;
  }

  public AutomatSprzedający(String lokalizacja, int liczbaGum) {

    this.lokalizacja = lokalizacja;

    stanBrakGum = new StanBrakGum(this);
    stanGumaSprzedana = new StanGumaSprzedana(this);
    stanJestMoneta = new StanJestMoneta(this);
    stanNieMaMonety = new StanNieMaMonety(this);
    stanWygrana = new StanWygrana(this);


    this.liczbaGum = liczbaGum;
    if (liczbaGum > 0) {
      setStan(stanNieMaMonety);
    }
  }

  public void włózMonetę() {
    stan.włózMonetę();
  }

  public void zwrócMonetę() {
    stan.zwrócMonetę();
  }

  public void przekręcGałkę() {
    stan.przekręcGałkę();
    if (stan == getStanJestMoneta()) {
      stan.wydaj();
    }
  }


  public void napełnij(int i) {
    liczbaGum += i;
    if (liczbaGum > 0 && stan == stanBrakGum) {
      setStan(stanNieMaMonety);
    }
    System.out.println("Napełniono automat. W automacie znajduje się teraz " + liczbaGum + " gum.");
  }

  @Override
  public String toString() {
    return "Automat Sprzedajacy SA " + "\nZapas: " + liczbaGum + "\n";
  }

  public void zwolnijGumę() {
    System.out.println("Guma wydana");
    liczbaGum--;
  }

  public int getLiczbaGum() {
    return liczbaGum;
  }

  public void setStan(Stan stan) {
    this.stan = stan;
  }

  public Stan getStanBrakGum() {
    return stanBrakGum;
  }

  public Stan getStanNieMaMonety() {
    return stanNieMaMonety;
  }

  public Stan getStanJestMoneta() {
    return stanJestMoneta;
  }

  public Stan getStanGumaSprzedana() {
    return stanGumaSprzedana;
  }

  public Stan getStanWygrana() {
    return stanWygrana;
  }

  public Stan getStan() {
    return stan;
  }
}
