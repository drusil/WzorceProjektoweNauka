import java.util.ArrayList;
import java.util.Iterator;

public class Kelnerka {
    MenuSkładnik wszystkieMenu;

    public Kelnerka(MenuSkładnik wszystkieMenu) {
        this.wszystkieMenu = wszystkieMenu;
    }

    public void drukujMenu() {
        wszystkieMenu.drukuj();
    }

    public void drukujMenuWegetariańskie() {
        Iterator iterator = wszystkieMenu.utwórzIterator();

        System.out.println("\nMENU WEGETARIAŃSKIE");
        while (iterator.hasNext()) {
            MenuSkładnik menuSkładnik = (MenuSkładnik) iterator.next();

            try {
                if (menuSkładnik.jestWegetariańska())
                    menuSkładnik.drukuj();
            } catch (UnsupportedOperationException e) {

            }
        }
    }
}

