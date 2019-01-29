package SortowanieKaczek;

public class Kaczka implements Comparable {
    String nazwa;
    int waga;

    public Kaczka(String nazwa, int waga) {
        this.nazwa = nazwa;
        this.waga = waga;
    }



    @Override
    public int compareTo(Object o) {

        Kaczka innaKaczka = (Kaczka) o;

        if(this.waga < innaKaczka.waga){
            return -1;
        } else if (this.waga == innaKaczka.waga){
            return 0;
        } else {
            // this.waga > innaKaczka.waga
            return 1;
        }

    }

    @Override
    public String toString() {
        return nazwa + " " + waga ;
    }
}
