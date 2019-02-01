package Command;

public class PolecenieWyłaczTV implements Polecenie{
    TV telewizor;

    public PolecenieWyłaczTV(TV telewizor) {
        this.telewizor = telewizor;
    }

    @Override
    public void wykonaj() {
        telewizor.wyłącz();
    }

    @Override
    public void wycofaj() {
     telewizor.włącz();
    }
}
