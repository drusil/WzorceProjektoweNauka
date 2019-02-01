package Command;

public class PolecenieWieżaStereoWłaczCD implements Polecenie {
  WieżaStereo wieżaStereo;

  public PolecenieWieżaStereoWłaczCD(WieżaStereo wieżaStereo) {
    this.wieżaStereo = wieżaStereo;
  }

  @Override
  public void wykonaj() {
    wieżaStereo.włącz();
    wieżaStereo.ustawCD();
    wieżaStereo.ustawGłosność(11);
  }

  @Override
  public void wycofaj() {
    wieżaStereo.wyłącz();
  }
}
