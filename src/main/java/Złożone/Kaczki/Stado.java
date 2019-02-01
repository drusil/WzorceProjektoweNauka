package Złożone.Kaczki;

import java.util.ArrayList;
import java.util.Iterator;

public class Stado implements Kwacząca {
  ArrayList ptaki = new ArrayList();

  public void dodaj(Kwacząca ptak) {
    ptaki.add(ptak);
  }

  @Override
  public void kwacz() {
    Iterator iterator = ptaki.iterator();
    while (iterator.hasNext()) {
      Kwacząca ptak = (Kwacząca) iterator.next();
      ptak.kwacz();
    }
  }

  @Override
  public void zarejstrujObserwatora(Obserwator obserwator) {
    Iterator iterator = ptaki.iterator();
    while (iterator.hasNext()) {
      Kwacząca ptak = (Kwacząca) iterator.next();
      ptak.zarejstrujObserwatora(obserwator);

    }
  }

  @Override
  public void powiadomObserwatorów() {

  }
}
