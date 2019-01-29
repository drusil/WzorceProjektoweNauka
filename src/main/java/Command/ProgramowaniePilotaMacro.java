public class ProgramowaniePilotaMacro {

    public static void main(String[] args) {


        SuperPilotZWycofywaniem pilot = new SuperPilotZWycofywaniem();

        Światło światło = new Światło("Salon");
        TV telewizor = new TV("Salon");
        WieżaStereo wieżaStereo = new WieżaStereo("Salon");
        Jacuzzi jacuzzi = new Jacuzzi();

        PolecenieWłączŚwiatło polecenieWłączŚwiatło = new PolecenieWłączŚwiatło(światło);
        PolecenieWyłączŚwiatło polecenieWyłączŚwiatło = new PolecenieWyłączŚwiatło(światło);

        PolecenieWłączTV polecenieWłączTV = new PolecenieWłączTV(telewizor);
        PolecenieWyłaczTV polecenieWyłaczTV = new PolecenieWyłaczTV(telewizor);

        PolecenieWieżaStereoWłaczCD polecenieWieżaStereoWłaczCD = new PolecenieWieżaStereoWłaczCD(wieżaStereo);
        PolecenieWieżaStereoWyłącz polecenieWieżaStereoWyłącz = new PolecenieWieżaStereoWyłącz(wieżaStereo);

        PolecenieWłączJacuzzi polecenieWłączJacuzzi = new PolecenieWłączJacuzzi(jacuzzi);
        PolecenieWyłączJacuzzi polecenieWyłączJacuzzi = new PolecenieWyłączJacuzzi(jacuzzi);

        Polecenie[] włączImprezę = {polecenieWieżaStereoWłaczCD, polecenieWłączJacuzzi, polecenieWłączTV, polecenieWłączŚwiatło};
        Polecenie[] wyłaczImprezę = {polecenieWieżaStereoWyłącz, polecenieWyłączJacuzzi, polecenieWyłaczTV, polecenieWyłączŚwiatło};

        MakroPolecenie makroWłączImprezę = new MakroPolecenie(włączImprezę);
        MakroPolecenie makroWyłączImprzę = new MakroPolecenie(wyłaczImprezę);

        pilot.ustawPolecenie(0,makroWłączImprezę,makroWyłączImprzę);

        System.out.println("-----Włączamy Makro------");
        pilot.wciśniętoPrzyciskWłącz(0);
        System.out.println("-----Wyłączamy Makro------");
        pilot.wciśniętoPrzycisjWyłacz(0);
        System.out.println("-----Włączamy Makro------");
        pilot.wciśniętoPrzyciskWłącz(0);
        System.out.println("---- Wycofujemy Makro------");
        pilot.wycofaj();
    }
}