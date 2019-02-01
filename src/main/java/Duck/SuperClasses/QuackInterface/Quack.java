package Duck.SuperClasses.QuackInterface;

public class Quack implements QuackInterface {
  @Override
  public void quack() {
    System.out.println("Quack, quack");
  }
}
