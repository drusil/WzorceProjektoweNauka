package Command;

public class WieżaStereo {

  String miejsce;

  public WieżaStereo(String miejsce) {
    this.miejsce = miejsce;
  }

  public void włącz() {
    System.out.println("Właczono wieżę stero");
  }

  public void ustawCD() {
    System.out.println("Ustawiono CD");
  }

  public void ustawGłosność(int i) {
    System.out.println("Głosność ustawiona na " + i);
  }

  public void wyłącz() {
    System.out.println("Wyłacz wieżę stereo");

  }
}
