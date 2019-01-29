package AutomanZeStanem;

public class StanBrakGum extends Stan {
    AutomatSprzedający automatSprzedający;

    public StanBrakGum(AutomatSprzedający automatSprzedający) {
    this.automatSprzedający = automatSprzedający;
    }

    @Override
    public void włózMonetę() {
         System.out.println("Ni9e można wrzucić monety gdy automat jest pusty");
    }

    @Override
    public void zwrócMonetę() {
         System.out.println("Nie włożyłeś monety");
    }

    @Override
    public void przekręcGałkę() {
          System.out.println("Przekręciłeś gałkę ale automat jest pusty");
    }

    @Override
    public void wydaj() {
          System.out.println("Nie wydano gumy");
    }
}
