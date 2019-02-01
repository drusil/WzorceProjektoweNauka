package Adapter;

import java.util.Random;

public class KaczkaAdapter implements Indyk {
  Kaczka kaczka;
  Random random;

  public KaczkaAdapter(Kaczka kaczka) {
    this.kaczka = kaczka;
    random = new Random();
  }

  @Override
  public void gulgocz() {
    kaczka.kawacz();
  }

  @Override
  public void lataj() {
    if (random.nextInt(5) == 0) kaczka.lataj();
  }
}
