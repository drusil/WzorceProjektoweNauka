public class MiniPilotTest {

    public static void main(String[] args) {
        MiniPilot pilot = new MiniPilot();

        Światło światło = new Światło("jadalnia");
        PolecenieWłączŚwiatło włączŚwiatło = new PolecenieWłączŚwiatło(światło);

        DrzwiGarażowe drzwiGarażowe = new DrzwiGarażowe();
        PolecenieOtwórzDrzwiGarażowe otwórzDrzwiGarażowe = new PolecenieOtwórzDrzwiGarażowe(drzwiGarażowe);

        pilot.ustawPolecenie(włączŚwiatło);
        pilot.przyciskZostałNacisnięty();

        pilot.ustawPolecenie(otwórzDrzwiGarażowe);
        pilot.przyciskZostałNacisnięty();


    }

}
