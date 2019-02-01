package Command;

public class MakroPolecenie implements Polecenie {
  Polecenie[] polecenia;

  public MakroPolecenie(Polecenie[] polecenia) {
    this.polecenia = polecenia;
  }

  @Override
  public void wykonaj() {
    for (Polecenie polecnie : polecenia
    ) {
      polecnie.wykonaj();

    }
  }

  @Override
  public void wycofaj() {
    for (Polecenie polecnie : polecenia
    ) {
      polecnie.wycofaj();

    }
  }
}
