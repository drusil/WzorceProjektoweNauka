package Stan.AutomanZeStanem;

public class StanNieMaMonety extends Stan {
  AutomatSprzedający automatSprzedający;

  public StanNieMaMonety(AutomatSprzedający automatSprzedający) {
    this.automatSprzedający = automatSprzedający;
  }

  @Override
  public void włózMonetę() {
    System.out.println("Moneta przyjęta");
    automatSprzedający.setStan(automatSprzedający.getStanJestMoneta());
  }


}
