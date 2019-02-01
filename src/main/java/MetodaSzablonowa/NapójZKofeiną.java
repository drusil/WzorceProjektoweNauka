package MetodaSzablonowa;

public abstract class NapójZKofeiną {

  final void recepturaParzenia() {
    gotowanieWody();
    zaparzanie();
    nalewanieDoFiliżanki();
    domieszanieDodatków();
  }

  abstract void zaparzanie();

  abstract void domieszanieDodatków();

  void gotowanieWody() {
    System.out.println("Gotowanie wody");
  }

  void nalewanieDoFiliżanki() {
    System.out.println("Nalewanie do filiżanki");
  }
}
