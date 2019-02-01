package Złożone.Kaczki;

public class FabrykaKaczek extends AbstarkcyjnaFabrykaKaczek {
  @Override
  public Kwacząca utwórzDzikaKaczka() {
    return new DzikaKaczka();
  }

  @Override
  public Kwacząca utwórzPłaskonosaKaczka() {
    return new PłaskonosaKaczka();
  }

  @Override
  public Kwacząca utwórzWabikKaczka() {
    return new WabikKaczka();
  }

  @Override
  public Kwacząca utwórzGumowaKaczka() {
    return new GumowaKaczka();
  }
}
