package Złożone.Kaczki;

public class DzikaKaczka implements Kwacząca {
    Obserwowany obserwowany;

    public DzikaKaczka() {
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
