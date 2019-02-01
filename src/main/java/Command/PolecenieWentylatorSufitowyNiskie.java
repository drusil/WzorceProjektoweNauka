package Command;


public class PolecenieWentylatorSufitowyNiskie implements Polecenie {
  WentylatorSufitowy wentylatorSufitowy;
  int poprzedniaPrędkość;

  public PolecenieWentylatorSufitowyNiskie(WentylatorSufitowy wentylatorSufitowy) {
    this.wentylatorSufitowy = wentylatorSufitowy;
  }


  @Override
  public void wykonaj() {
    poprzedniaPrędkość = wentylatorSufitowy.getPrędkość();
    wentylatorSufitowy.niskieOborty();


  }

  @Override
  public void wycofaj() {
    if (poprzedniaPrędkość == WentylatorSufitowy.SZYBKO) wentylatorSufitowy.wysokieOborty();
    else if (poprzedniaPrędkość == WentylatorSufitowy.ŚREDNI) wentylatorSufitowy.średnieOborty();
    else if (poprzedniaPrędkość == WentylatorSufitowy.WOLNO) wentylatorSufitowy.niskieOborty();
    else if (poprzedniaPrędkość == WentylatorSufitowy.WYŁĄCZ) wentylatorSufitowy.wyłacz();

  }
}


