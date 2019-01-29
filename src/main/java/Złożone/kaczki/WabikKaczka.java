package kaczki;

public class WabikKaczka implements Kwacząca {
   Obserwowany obserwowany;

    public WabikKaczka() {
        this.obserwowany = new Obserwowany(this);
    }

    @Override
    public void kwacz() {
        System.out.println("Kwak!");
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
