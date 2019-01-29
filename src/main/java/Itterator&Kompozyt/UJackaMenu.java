import java.util.Hashtable;
import java.util.Iterator;

public class UJackaMenu  {
    Hashtable pozycjeMenu = new Hashtable();

    public UJackaMenu(){
        dodajElement("Kanapka wegetaraiańska z frytkami",
                "Kanapka wegetariańska z sałatą i pomidorem, frytki",true,3.99);
    dodajElement("Zupa dania","Filiżanka zupy dnia,sałatka",false,3.69);
    dodajElement("Burrito","Duze burrito z fasolą, sosem salsa i awakado",true,4.29);
    }

    public void dodajElement(String nazwa,String opis, boolean wegetariańśka, double cena){
        PozycjaMenu pozycjaMenu = new PozycjaMenu(nazwa,opis,wegetariańśka,cena);

    }

    public Hashtable pobierzPozycjeMenu(){
        return pozycjeMenu;
    }


}
