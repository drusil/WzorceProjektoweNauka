package Command;

public class PolecenieWyłaczWentylatorSufitowy implements Polecenie {

    WentylatorSufitowy wentylatorSufitowy;

    public PolecenieWyłaczWentylatorSufitowy(WentylatorSufitowy wentylatorSufitowy) {
        this.wentylatorSufitowy = wentylatorSufitowy;
    }

    @Override
    public void wykonaj() {
        wentylatorSufitowy.wyłacz();
    }

    @Override
    public void wycofaj() {
        wentylatorSufitowy.wysokieOborty();
    }
}
