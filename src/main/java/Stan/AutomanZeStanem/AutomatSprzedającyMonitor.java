package AutomanZeStanem;

public class AutomatSprzedającyMonitor {

    AutomatSprzedający automat;

    public AutomatSprzedającyMonitor(AutomatSprzedający automat) {
        this.automat = automat;
    }

    public void raport(){
        System.out.println("Automat sprzedający: " + automat.getLokalizacja());
        System.out.println("Towar :" + automat.getLiczbaGum());
        System.out.println("Bieżący stan urządzenia" + automat.getStan());
    }
}
