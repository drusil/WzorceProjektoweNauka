package Command;

public class PolecenieWłączJacuzzi implements Polecenie {
  Jacuzzi jacuzzi;

  public PolecenieWłączJacuzzi(Jacuzzi jacuzzi) {
    this.jacuzzi = jacuzzi;
  }

  @Override
  public void wykonaj() {
    jacuzzi.włącz();
  }

  @Override
  public void wycofaj() {
    jacuzzi.wyłacz();
  }
}
