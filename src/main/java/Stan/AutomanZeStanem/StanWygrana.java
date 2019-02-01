package Stan.AutomanZeStanem;

public class StanWygrana extends Stan {
  AutomatSprzedający automatSprzedający;

  public StanWygrana(AutomatSprzedający automatSprzedający) {
    this.automatSprzedający = automatSprzedający;
  }


  @Override
  public void wydaj() {
    automatSprzedający.zwolnijGumę();
    if (automatSprzedający.getLiczbaGum() == 0) {
      automatSprzedający.setStan(automatSprzedający.getStanBrakGum());
    } else {
      System.out.println("Wygrałes druga guma gratis");
      automatSprzedający.zwolnijGumę();
      if (automatSprzedający.getLiczbaGum() > 0) {
        automatSprzedający.setStan(automatSprzedający.getStanNieMaMonety());
      } else {
        automatSprzedający.setStan(automatSprzedający.getStanBrakGum());
      }
    }
  }
}
