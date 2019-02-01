package Command;

public class PolecenieWyłączŚwiatło implements Polecenie {
  Światło światło;

  public PolecenieWyłączŚwiatło(Światło światło) {
    this.światło = światło;
  }

  @Override
  public void wykonaj() {
    światło.wyłącz();
  }

  @Override
  public void wycofaj() {
    światło.włącz();
  }
}
