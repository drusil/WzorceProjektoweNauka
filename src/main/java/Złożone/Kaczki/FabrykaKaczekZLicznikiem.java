package Złożone.Kaczki;

public class FabrykaKaczekZLicznikiem extends AbstarkcyjnaFabrykaKaczek {
  @Override
  public Kwacząca utwórzDzikaKaczka() {
    return new KwakLicznik(new DzikaKaczka());
  }

  @Override
  public Kwacząca utwórzPłaskonosaKaczka() {
    return new KwakLicznik(new PłaskonosaKaczka());
  }

  @Override
  public Kwacząca utwórzWabikKaczka() {
    return new KwakLicznik(new WabikKaczka());
  }

  @Override
  public Kwacząca utwórzGumowaKaczka() {
    return new KwakLicznik(new GumowaKaczka());

  }
}
