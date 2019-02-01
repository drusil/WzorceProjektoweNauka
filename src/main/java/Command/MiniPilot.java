package Command;

public class MiniPilot {
  Polecenie slot;

  public MiniPilot() {
  }

  public void ustawPolecenie(Polecenie polecenie) {
    this.slot = polecenie;
  }

  public void przyciskZostałNacisnięty() {
    slot.wykonaj();
  }
}
