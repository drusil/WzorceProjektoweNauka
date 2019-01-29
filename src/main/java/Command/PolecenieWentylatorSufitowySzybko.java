public class PolecenieWentylatorSufitowySzybko implements Polecenie {
    WentylatorSufitowy wentylatorSufitowy;
    int poprzedniaPrędkość;

    public PolecenieWentylatorSufitowySzybko(WentylatorSufitowy wentylatorSufitowy) {
        this.wentylatorSufitowy = wentylatorSufitowy;
    }


    @Override
    public void wykonaj() {
        poprzedniaPrędkość = wentylatorSufitowy.getPrędkość();
        wentylatorSufitowy.wysokieOborty();


    }

    @Override
    public void wycofaj() {
        if (poprzedniaPrędkość == WentylatorSufitowy.SZYBKO) wentylatorSufitowy.wysokieOborty();
        else if (poprzedniaPrędkość == WentylatorSufitowy.ŚREDNI) wentylatorSufitowy.średnieOborty();
        else if (poprzedniaPrędkość == WentylatorSufitowy.WOLNO) wentylatorSufitowy.niskieOborty();
        else if (poprzedniaPrędkość == WentylatorSufitowy.WYŁĄCZ) wentylatorSufitowy.wyłacz();

    }
}
