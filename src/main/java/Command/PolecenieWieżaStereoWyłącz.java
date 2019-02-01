package Command;

public class PolecenieWieżaStereoWyłącz implements Polecenie {

  WieżaStereo wieżaStereo;

  public PolecenieWieżaStereoWyłącz(WieżaStereo wieżaStereo) {
    this.wieżaStereo = wieżaStereo;
  }

  @Override
  public void wykonaj() {
    wieżaStereo.wyłącz();
  }

  @Override
  public void wycofaj() {
    wieżaStereo.włącz();
  }
}
