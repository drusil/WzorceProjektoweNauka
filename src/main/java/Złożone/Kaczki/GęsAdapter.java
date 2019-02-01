package Złożone.Kaczki;

public class GęsAdapter implements Kwacząca {
  Gęś gęś;
  Obserwowany obserwowany;

  public GęsAdapter(Gęś gęś) {
    this.gęś = gęś;
    this.obserwowany = new Obserwowany(this);
  }

  @Override
  public void kwacz() {
    gęś.gęgaj();
    obserwowany.powiadomObserwatorów();
  }

  @Override
  public void zarejstrujObserwatora(Obserwator obserwator) {
    obserwowany.zarejstrujObserwatora(obserwator);
  }

  @Override
  public void powiadomObserwatorów() {
    obserwowany.powiadomObserwatorów();
  }
}
