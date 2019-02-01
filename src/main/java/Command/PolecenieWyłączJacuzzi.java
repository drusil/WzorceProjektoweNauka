package Command;

public class PolecenieWyłączJacuzzi implements Polecenie {

  Jacuzzi jacuzzi;

  public PolecenieWyłączJacuzzi(Jacuzzi jacuzzi) {
    this.jacuzzi = jacuzzi;
  }

  @Override
  public void wykonaj() {
    jacuzzi.wyłacz();
  }

  @Override
  public void wycofaj() {
    jacuzzi.włącz();
  }
}
