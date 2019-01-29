public class WentylatorSufitowy {
    public static final int SZYBKO = 3;
    public static final int ŚREDNI = 2;
    public static final int WOLNO = 1;
    public static final int WYŁĄCZ =0;
    String miejsce;
    int prędkość;


    public WentylatorSufitowy(String miejsce) {
        this.miejsce = miejsce;
        prędkość = WYŁĄCZ;
    }

    public void wysokieOborty(){
        prędkość = SZYBKO;
        System.out.println("Wentylator jest włączony, wysokie obroty");
    }
    public void średnieOborty(){
        prędkość = ŚREDNI;
        System.out.println("Wentylator jest włączony, średnie obroty");
    }
    public void niskieOborty(){
        prędkość = WOLNO;
        System.out.println("Wentylator jest włączony, niskie obroty");
    }


    public void wyłacz(){

        System.out.println("Wentylator sufitowy w " + miejsce +" został wyłączony" );

    }

    public int getPrędkość() {
        return prędkość;
    }
}
