public class AutomatSprzedajacyTest {
    public static void main(String[] args) {
        AutomatSprzedajacy automatSprzedajacy = new AutomatSprzedajacy(5);

        System.out.println(automatSprzedajacy);

        automatSprzedajacy.włózMonetę();
        automatSprzedajacy.przekręcGałke();

        System.out.println(automatSprzedajacy);

        automatSprzedajacy.włózMonetę();
        automatSprzedajacy.zwrócMonetę();
        automatSprzedajacy.przekręcGałke();

        System.out.println(automatSprzedajacy);

        automatSprzedajacy.włózMonetę();
        automatSprzedajacy.przekręcGałke();
        automatSprzedajacy.włózMonetę();
        automatSprzedajacy.przekręcGałke();
        automatSprzedajacy.zwrócMonetę();

        System.out.println(automatSprzedajacy);

        automatSprzedajacy.włózMonetę();
        automatSprzedajacy.włózMonetę();
        automatSprzedajacy.przekręcGałke();
        automatSprzedajacy.włózMonetę();
        automatSprzedajacy.przekręcGałke();
        automatSprzedajacy.włózMonetę();
        automatSprzedajacy.przekręcGałke();

        System.out.println(automatSprzedajacy);
    }
}
