package Stan.AutomanZeStanem;

public class StanGumaSprzedana extends Stan {
  AutomatSprzedający automatSprzedający;

  public StanGumaSprzedana(AutomatSprzedający automatSprzedający) {
    this.automatSprzedający = automatSprzedający;
  }


  @Override
  public void wydaj() {
    System.out.println("Wydaję gumę");
    automatSprzedający.zwolnijGumę();
    if (automatSprzedający.getLiczbaGum() > 0) {
      automatSprzedający.setStan(automatSprzedający.getStanNieMaMonety());
    } else {
      automatSprzedający.setStan(automatSprzedający.getStanBrakGum());
    }

  }
}
