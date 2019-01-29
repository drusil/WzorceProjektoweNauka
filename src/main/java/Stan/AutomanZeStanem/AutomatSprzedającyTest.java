package AutomanZeStanem;

public class AutomatSprzedającyTest {
    public static void main(String[] args) {
        AutomatSprzedający automatSprzedający = new AutomatSprzedający(15);

        System.out.println(automatSprzedający);

        automatSprzedający.włózMonetę();
        automatSprzedający.zwrócMonetę();
        automatSprzedający.włózMonetę();

        automatSprzedający.przekręcGałkę();

        System.out.println(automatSprzedający);

        automatSprzedający.włózMonetę();
        automatSprzedający.przekręcGałkę();
        automatSprzedający.włózMonetę();

        automatSprzedający.napełnij(2);


        automatSprzedający.przekręcGałkę();
        automatSprzedający.włózMonetę();
        automatSprzedający.przekręcGałkę();
    }
}
