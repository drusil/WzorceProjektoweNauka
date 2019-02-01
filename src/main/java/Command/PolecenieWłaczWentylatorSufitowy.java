package Command;

public class PolecenieWłaczWentylatorSufitowy implements Polecenie {
  WentylatorSufitowy wentylatorSufitowy;

  public PolecenieWłaczWentylatorSufitowy(WentylatorSufitowy wentylatorSufitowy) {
    this.wentylatorSufitowy = wentylatorSufitowy;
  }

  @Override
  public void wykonaj() {
    wentylatorSufitowy.wysokieOborty();
  }

  @Override
  public void wycofaj() {
    wentylatorSufitowy.wyłacz();
  }
}
