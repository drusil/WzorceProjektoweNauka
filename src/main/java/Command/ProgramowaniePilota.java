public class ProgramowaniePilota {

    public static void main(String[] args) {
        SuperPilotZWycofywaniem pilot = new SuperPilotZWycofywaniem();

        Światło jadalniaŚwiatło = new Światło("Jadalnia");
        Światło kuchniaŚwiatło = new Światło("Kuchnia");
        WentylatorSufitowy wentylatorSufitowy = new WentylatorSufitowy ("Jadalnia");
        DrzwiGarażowe drzwiGarażowe = new DrzwiGarażowe();
        WieżaStereo wieżaStereo = new WieżaStereo("Jadalnia");

        PolecenieWłączŚwiatło jadalniaWłaczŚwaitło = new PolecenieWłączŚwiatło(jadalniaŚwiatło);
        PolecenieWyłączŚwiatło jadalniaWyłączŚwiatło = new PolecenieWyłączŚwiatło(jadalniaŚwiatło);
        PolecenieWłączŚwiatło kuchniaWłączŚwiatło = new PolecenieWłączŚwiatło(kuchniaŚwiatło);
        PolecenieWyłączŚwiatło kuchniaWyłączŚwiatło = new PolecenieWyłączŚwiatło(kuchniaŚwiatło);

        PolecenieWłaczWentylatorSufitowy właczWentylatorSufitowy = new PolecenieWłaczWentylatorSufitowy(wentylatorSufitowy);
        PolecenieWyłaczWentylatorSufitowy wyłaczWentylatorSufitowy = new PolecenieWyłaczWentylatorSufitowy(wentylatorSufitowy);

        PolecenieOtwórzDrzwiGarażowe otwórzDrzwiGarażowe = new PolecenieOtwórzDrzwiGarażowe(drzwiGarażowe);
        PolecenieZamknijDrzwiGarażowe zamknijDrzwiGarazowe = new PolecenieZamknijDrzwiGarażowe(drzwiGarażowe);

        PolecenieWieżaStereoWłaczCD właczCDWieżaStereo = new PolecenieWieżaStereoWłaczCD(wieżaStereo);
        PolecenieWieżaStereoWyłącz wyłaczWieżaStereo = new PolecenieWieżaStereoWyłącz(wieżaStereo);

        pilot.ustawPolecenie(0, jadalniaWłaczŚwaitło,jadalniaWyłączŚwiatło);
        pilot.ustawPolecenie(1, kuchniaWyłączŚwiatło,kuchniaWyłączŚwiatło);
        pilot.ustawPolecenie(2, właczWentylatorSufitowy,wyłaczWentylatorSufitowy);
        pilot.ustawPolecenie(3, właczCDWieżaStereo,wyłaczWieżaStereo );

        System.out.println(pilot);

        pilot.wciśniętoPrzyciskWłącz(0);
        pilot.wciśniętoPrzycisjWyłacz(0);
        pilot.wycofaj();
        pilot.wciśniętoPrzyciskWłącz(1);
        pilot.wciśniętoPrzycisjWyłacz(1);
        pilot.wycofaj();
        pilot.wciśniętoPrzyciskWłącz(2);
        pilot.wciśniętoPrzycisjWyłacz(2);
        pilot.wciśniętoPrzyciskWłącz(3);
        pilot.wciśniętoPrzycisjWyłacz(3);

    }
}
