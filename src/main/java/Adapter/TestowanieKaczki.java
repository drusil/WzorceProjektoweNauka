package Adapter;


public class TestowanieKaczki {

  public static void main(String[] args) {
    DzikaKaczka kaczka = new DzikaKaczka();

    DzikiIndyk indyk = new DzikiIndyk();
    Kaczka indykAdapter = new IndykAdapter(indyk);

    System.out.println("----- Indyk powiada tak...");
    indyk.gulgocz();
    indyk.lataj();

    System.out.println("\n-----Kaczka powiada tak....");
    testujKaczkę(kaczka);


    System.out.println("\n----- A IndykAdapter powiada tak...");
    testujKaczkę(indykAdapter);
  }

  private static void testujKaczkę(Kaczka kaczka) {
    kaczka.kawacz();
    kaczka.lataj();
  }
}
