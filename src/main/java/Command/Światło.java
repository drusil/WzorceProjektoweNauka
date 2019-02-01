package Command;

public class Światło {
  String miejsce;

  public Światło(String miejsce) {
    this.miejsce = miejsce;
  }

  public void włącz() {
    System.out.println(miejsce + ", światło jest właczone");
  }

  public void wyłącz() {
    System.out.println(miejsce + ", światło jest wyłaczone");

  }
}
