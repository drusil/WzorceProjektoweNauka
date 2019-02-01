package Command;

public class PolecenieOtwórzDrzwiGarażowe implements Polecenie {

  DrzwiGarażowe drzwiGarażowe;

  public PolecenieOtwórzDrzwiGarażowe(DrzwiGarażowe drzwiGarażowe) {
    this.drzwiGarażowe = drzwiGarażowe;
  }

  @Override
  public void wykonaj() {
    drzwiGarażowe.doGóry();
  }

  @Override
  public void wycofaj() {
    drzwiGarażowe.naDół();
  }
}
