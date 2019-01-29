public class PolecenieZamknijDrzwiGarażowe implements Polecenie{

    DrzwiGarażowe drzwiGarażowe;

    public PolecenieZamknijDrzwiGarażowe(DrzwiGarażowe drzwiGarażowe) {
        this.drzwiGarażowe = drzwiGarażowe;
    }

    @Override
    public void wykonaj() {
        drzwiGarażowe.naDół();
    }

    @Override
    public void wycofaj() {
        drzwiGarażowe.doGóry();
    }
}
