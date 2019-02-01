package Stan.AutomanZeStanem;

import java.util.Random;

public class StanJestMoneta extends Stan {
  AutomatSprzedający automatSprzedający;
  Random losowaWygrana = new Random(System.currentTimeMillis());

  public StanJestMoneta(AutomatSprzedający automatSprzedający) {
    this.automatSprzedający = automatSprzedający;
  }


  @Override
  public void zwrócMonetę() {
    System.out.println("Zwracam monete");
    automatSprzedający.setStan(automatSprzedający.getStanNieMaMonety());
  }

  @Override
  public void przekręcGałkę() {
    System.out.println("Sprzedrzedaję gumę");
    int wygrana = losowaWygrana.nextInt(10);

    if (wygrana == 0) {
      automatSprzedający.setStan(automatSprzedający.getStanWygrana());
    } else {
      automatSprzedający.setStan(automatSprzedający.getStanGumaSprzedana());
    }
  }


}
