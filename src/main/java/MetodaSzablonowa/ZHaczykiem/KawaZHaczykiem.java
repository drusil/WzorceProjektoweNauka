package ZHaczykiem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KawaZHaczykiem extends NapójZKofeinąZHaczykiem {

    @Override
    void zaparzanie() {
        System.out.println("Zaparzanie i przesączanie kawy przez filtr");
    }

    @Override
    void domieszanieDodatków() {
        System.out.println("Dodawanie cukiru i mleka do smaku");
    }

    @Override
    boolean czyKlientChceDodatki() {

        String odpowiedź = pobierzOdpowiedź();

        if(odpowiedź.toLowerCase().startsWith("t")){
            return true;
        }
        else{
            return false;
        }

    }

    private String pobierzOdpowiedź() {
    String odpowiedź = null;
    System.out.println("Czy życzy pan sobie dodatia cukru i mleka do kawy (t/N)");


        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            odpowiedź = in.readLine();

        } catch (IOException e) {
            System.err.println("Bład wejścia-wyjścia podczas doczytywania odpowiedzi");
            e.printStackTrace();
        }

        if(odpowiedź == null){
            return odpowiedź;
        } else {
            return odpowiedź;
        }



    }
}
