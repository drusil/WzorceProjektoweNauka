package kaczki;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;

public class Obserwowany implements KwakObserwowany {
    ArrayList obserwatorzy = new ArrayList();
    KwakObserwowany kaczka;

    public Obserwowany(KwakObserwowany kaczka) {
        this.kaczka = kaczka;
    }

    @Override
    public void zarejstrujObserwatora(Obserwator obserwator) {
        obserwatorzy.add(obserwator);
    }

    @Override
    public void powiadomObserwatorów() {
        Iterator iterator = obserwatorzy.iterator();
        while (iterator.hasNext()){
            Obserwator obserwator = (Obserwator) iterator.next();
            obserwator.aktualizuj(kaczka);
        }
    }
}
