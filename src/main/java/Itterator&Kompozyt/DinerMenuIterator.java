import java.io.InputStream;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    PozycjaMenu[] elementy;
    int pozycja = 0;

    public DinerMenuIterator(PozycjaMenu[] elementy) {
        this.elementy = elementy;
    }

    @Override
    public boolean hasNext() {
        if (pozycja >= elementy.length || elementy[pozycja] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        PozycjaMenu pozycjaMenu = elementy[pozycja];
        pozycja++;
        return pozycjaMenu;
    }

    @Override
    public void remove() {
        if(pozycja <=0){
            throw new IllegalStateException("Nie można usunąć przed pierwszy wywołaniem metody next()");
        }
        if(elementy[pozycja-1] != null){
            for (int i= pozycja-1; i< (elementy.length-1); i++){
                elementy[i] = elementy[i+1];
            }
            elementy[elementy.length-1] = null;
        }
    }
}
