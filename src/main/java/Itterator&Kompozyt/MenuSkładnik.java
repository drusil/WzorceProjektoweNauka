import java.util.Iterator;

public abstract class MenuSkładnik {

    public void dodaj(MenuSkładnik menuSkładnik){
        throw new UnsupportedOperationException();
    }

    public void usuń(MenuSkładnik menuSkładnik){
        throw new UnsupportedOperationException();
    }

    public MenuSkładnik pobierzPotomek (int i){
        throw new UnsupportedOperationException();
    }

    public String pobierzNazwa(){
        throw new UnsupportedOperationException();
    }

    public String pobierzOpis(){
        throw new UnsupportedOperationException();
    }

    public boolean jestWegetariańska(){
        throw new UnsupportedOperationException();
    }

    public double pobierzCena(){
        throw new UnsupportedOperationException();
    }

    public void drukuj(){
        throw new UnsupportedOperationException();
    }

    public Iterator utwórzIterator(){
        throw new UnsupportedOperationException();
    }
}
