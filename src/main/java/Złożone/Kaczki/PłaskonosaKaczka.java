package Złożone.Kaczki;

public class PłaskonosaKaczka implements Kwacząca {
  Obserwowany obserwowany;

  public PłaskonosaKaczka() {
    this.obserwowany = new Obserwowany(this);
  }

  @Override
  public void kwacz() {
    System.out.println("Kwa! Kwa!");
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
