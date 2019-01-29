package SortowanieKaczek;

import java.util.Arrays;

public class TestSortowanieKaczek {
    public static void main(String[] args) {
        Kaczka[] kaczki= {
                new Kaczka("Kaczor Duffy",8),
                new Kaczka("Kaczor Dewey", 2),
                new Kaczka("Kaczor Howard", 7),
                new Kaczka("Kaczor Louie",2),
                new Kaczka("Kaczor Donald",10),
                new Kaczka("Kaczor Huey",2)
        };

        System.out.println("Przed sortowaniem");
        for (Kaczka kaczka:kaczki) System.out.println(kaczka);

        Arrays.sort(kaczki);

        System.out.println("\nPo sortowaniem");
        for (Kaczka kaczka:kaczki) System.out.println(kaczka);
    }
}
