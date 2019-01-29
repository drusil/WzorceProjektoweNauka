import java.util.Iterator;

public class PozycjaMenu extends MenuSkładnik {
    String nazwa;
    String opis;
    boolean wegetariańska;
    double cena;

    public String pobierzNazwa() {
        return nazwa;
    }

    public String pobierzOpis() {
        return opis;
    }

    public boolean jestWegetariańska() {
        return wegetariańska;
    }

    public double pobierzCena() {
        return cena;
    }

    public PozycjaMenu(String nazwa, String opis, boolean wegetariańska, double cena) {

        this.nazwa = nazwa;
        this.opis = opis;
        this.wegetariańska = wegetariańska;
        this.cena = cena;
    }

    public void drukuj(){
        System.out.print(" " + pobierzNazwa());
        if(jestWegetariańska()){
            System.out.print(" (w) ");
        }
        System.out.println(", " + pobierzCena());
        System.out.println("    -- " + pobierzOpis());

    }

    public Iterator utwórzIterator(){
        return new IteratorPusty();
    }
}
