package Złożone.DJ;

public interface BeatModelInterface {
  void inicjuj();

  void start();

  void stop();

  void setBPM(int bpm);

  int getBPM();

  void zarejstujObserwatora(ObserwatorUderzeń o);

  void wyrejstujObserwatora(ObserwatorUderzeń o);

  void zarejstujObserwatora(ObserwatorBPM o);

  void wyrejstujObserwatora(ObserwatorBPM o);

}
