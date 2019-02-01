package Stan;

public class AutomatSprzedajacy {
  final static int BRAK_GUM = 0;
  final static int NIE_MA_MONETY = 1;
  final static int JEST_MONETA = 2;
  final static int GUMA_SPRZEDANA = 3;

  int stan = BRAK_GUM;
  int liczbaGum = 0;

  public AutomatSprzedajacy(int liczbaGum) {
    this.liczbaGum = liczbaGum;
    if (liczbaGum > 0) {
      stan = NIE_MA_MONETY;
    }
  }

  public void włózMonetę() {
    if (stan == JEST_MONETA) {
      System.out.println("Nie można włożyć więcej niż jednej monety");
    } else if (stan == NIE_MA_MONETY) {
      System.out.println("Moneta przyjęta");
      stan = JEST_MONETA;
    } else if (stan == BRAK_GUM) {
      System.out.println("Nie możesz włożyć monety gdy automat jest pusty");
    } else if (stan == GUMA_SPRZEDANA) {
      System.out.println("Proszę czekać na gumę");
    }
  }

  public void zwrócMonetę() {
    if (stan == JEST_MONETA) {
      System.out.println("Moneta zwrócona");
      stan = NIE_MA_MONETY;
    } else if (stan == NIE_MA_MONETY) {
      System.out.println("Nie włożyłeś monety");
    } else if (stan == BRAK_GUM) {
      System.out.println("Nie włożyłeś monety");
    } else if (stan == GUMA_SPRZEDANA) {
      System.out.println("Nie można zwrócic monety po przkręceniu gałki");
    }
  }

  public void przekręcGałke() {
    if (stan == JEST_MONETA) {
      System.out.println("Obróciłeś gałkę");
      stan = GUMA_SPRZEDANA;
      wydaj();
    } else if (stan == NIE_MA_MONETY) {
      System.out.println("Zanim przkręcisz gałkę włóż monetę");
    } else if (stan == BRAK_GUM) {
      System.out.println("Przekręciłeś gałkę mimo ze automat jest pusty");
    } else if (stan == GUMA_SPRZEDANA) {
      System.out.println("Proszę czekać na gumę");
    }
  }


  private void wydaj() {
    if (stan == JEST_MONETA) {
      System.out.println("Nie wydano gumy");
    } else if (stan == NIE_MA_MONETY) {
      System.out.println("Najpierw zapłać");
    } else if (stan == BRAK_GUM) {
      System.out.println("nie wydano gumy");
    } else if (stan == GUMA_SPRZEDANA) {
      System.out.println("wypada guma");
      liczbaGum--;
      if (liczbaGum == 0) {
        stan = BRAK_GUM;
      } else {
        stan = NIE_MA_MONETY;
      }
    }
  }

  public void napełnij(int liczbaNowychGum) {
    liczbaGum += liczbaNowychGum;
  }

  @Override
  public String toString() {
    return "Automat Sprzedajacy SA " + "\nZapas: " + liczbaGum + "\n";
  }
}
