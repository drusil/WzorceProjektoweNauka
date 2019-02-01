package Command;

public class PolecenieWłączŚwiatło implements Polecenie {

  Światło światło;

  public PolecenieWłączŚwiatło(Światło światło) {
    this.światło = światło;
  }

  @Override
  public void wykonaj() {
    światło.włącz();
  }

  @Override
  public void wycofaj() {
    światło.wyłącz();
  }
}
