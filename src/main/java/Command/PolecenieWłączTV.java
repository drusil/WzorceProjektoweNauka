package Command;

public class PolecenieWłączTV implements Polecenie {
  TV telewizor;

  public PolecenieWłączTV(TV telewizor) {
    this.telewizor = telewizor;
  }

  @Override
  public void wykonaj() {
    telewizor.wyłącz();
  }

  @Override
  public void wycofaj() {
    telewizor.wyłącz();
  }
}
