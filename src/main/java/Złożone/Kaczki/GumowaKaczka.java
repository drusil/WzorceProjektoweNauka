package Złożone.Kaczki;

public class GumowaKaczka implements Kwacząca {
  Obserwowany obserwowany;

  public GumowaKaczka() {
    this.obserwowany = new Obserwowany(this);
  }

  @Override
  public void kwacz() {
    System.out.println("Piszczę!");
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
