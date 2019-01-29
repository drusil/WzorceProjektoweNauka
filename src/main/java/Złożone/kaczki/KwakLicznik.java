package kaczki;

public class KwakLicznik implements Kwacząca {
    Kwacząca kaczka;
    static int licznikKwaknięć;


    public KwakLicznik(Kwacząca kaczka) {
        this.kaczka = kaczka;
    }

    @Override
    public void kwacz() {
        kaczka.kwacz();
        licznikKwaknięć++;
    }

    public static int getLicznikKwaknięć() {
        return licznikKwaknięć;
    }

    @Override
    public void zarejstrujObserwatora(Obserwator obserwator) {
        kaczka.zarejstrujObserwatora(obserwator);
    }

    @Override
    public void powiadomObserwatorów() {
      kaczka.powiadomObserwatorów();
    }
}
