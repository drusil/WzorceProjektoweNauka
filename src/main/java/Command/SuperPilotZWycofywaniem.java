import java.util.Arrays;

public class SuperPilotZWycofywaniem {
    Polecenie[] polecenieWłącz;
    Polecenie[] polecenieWyłacz;
    Polecenie polecenieWycofaj;

    public SuperPilotZWycofywaniem() {

        this.polecenieWyłacz = new Polecenie[7];
        this.polecenieWłącz = new Polecenie[7];

        Polecenie brakPolecenia = new BrakPolecenia();
        for (int i = 0; i < 7; i++) {
            polecenieWłącz[i] = brakPolecenia;
            polecenieWyłacz[i] = brakPolecenia;

        }
        polecenieWycofaj = brakPolecenia;

    }

    public void ustawPolecenie(int slot, Polecenie polecenieWłacz, Polecenie polecenieWyłacz) {
        this.polecenieWyłacz[slot] = polecenieWyłacz;
        this.polecenieWłącz[slot] = polecenieWłacz;
    }

    public void wciśniętoPrzyciskWłącz(int slot) {
        polecenieWłącz[slot].wykonaj();
        polecenieWycofaj = polecenieWłącz[slot];
    }

    public void wciśniętoPrzycisjWyłacz(int slot) {
        polecenieWyłacz[slot].wykonaj();
        polecenieWycofaj = polecenieWyłacz[slot];
    }

    public void wycofaj(){
        polecenieWycofaj.wycofaj();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n--------- SuperPilotZWycofywaniem---------\n");
        for (int i = 0; i < polecenieWłącz.length; i++) {
            stringBuffer.append("[slot " + i + "]" + polecenieWłącz[i].getClass().getName());
            stringBuffer.append("  " + polecenieWyłacz[i].getClass().getName());
            stringBuffer.append("\n");
        }

        return stringBuffer.toString();
    }
}
