package ZHaczykiem;

public class NapojeJazdaPróbna {

    public static void main(String[] args) {

        HerbataZHaczykiem herbata = new HerbataZHaczykiem();
        KawaZHaczykiem kawa = new KawaZHaczykiem();

        System.out.println("\n Przyrządzmy wspaniałą, gorącą herbatę...");
        herbata.recepturaParzenia();

        System.out.println("\n Przyrządzamy gorącą aromatyczną kawę...");
        kawa.recepturaParzenia();
    }

}
