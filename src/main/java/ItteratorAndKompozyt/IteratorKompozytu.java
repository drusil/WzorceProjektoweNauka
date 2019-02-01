package ItteratorAndKompozyt;

import java.util.Iterator;
import java.util.Stack;

public class IteratorKompozytu implements Iterator {
  Stack stos = new Stack();

  public IteratorKompozytu(Iterator iterator) {
    stos.push(iterator);
  }

  @Override
  public boolean hasNext() {
    if (stos.isEmpty()) {
      return false;
    } else {
      Iterator iterator = (Iterator) stos.peek();
      if (!iterator.hasNext()) {
        stos.pop();
        return hasNext();
      } else {
        return true;
      }
    }
  }

  @Override
  public Object next() {
    if (hasNext()) {
      Iterator iterator = (Iterator) stos.peek();
      MenuSkładnik składnik = (MenuSkładnik) iterator.next();
      if (składnik instanceof Menu) {
        stos.push(((Menu) składnik).utwórzIterator());
      }
      return składnik;
    } else {
      return null;
    }
  }


  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }
}
