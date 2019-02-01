package Command;

public class TV {

  String miejsce;

  public TV(String miejsce) {
    this.miejsce = miejsce;
  }

  public void włącz() {
    System.out.println("Telewizor w " + miejsce + " jest właczony");
  }

  public void wyłącz() {
    System.out.println("Telewizor w " + miejsce + " jest wyłaczony");
  }
}
