import java.util.ArrayList;

public abstract class Pizza {
String name;
String dought;
String sauce;
ArrayList ingredients = new ArrayList();


 void przygotowanie(){
     System.out.println("Przygotowanie: " + name);
     System.out.println("Wyrabianie ciasta");
     System.out.println("Dodawanie sosu...");
     System.out.println("Dodatki: ");
     for (int i = 0; i < ingredients.size(); i++){
         System.out.println("  " + ingredients.get(i));
     }
 }



 void pieczenie(){
 System.out.println("Pieczenie: 25 minut w temperaturze 350 stopni Celcjusza.");
    }
     void krojenie(){
     System.out.println("Krojenie pizzy na 8 kawałków.");
     }
    void pakowania(){
     System.out.println("Pakowanie pizzy w oficjalne pudełko naszej sieci Pizzerii.");
    }

    public String getName() {
        return name;
    }
}
