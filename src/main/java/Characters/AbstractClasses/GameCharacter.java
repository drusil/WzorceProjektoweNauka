package AbstractClasses;

import WeaponInterface.WeaponInterface;

public class GameCharacter {
    WeaponInterface weaponInterface;

    public void fight(){
        weaponInterface.useWeapon();
    };

    public GameCharacter(WeaponInterface weaponInterface) {
        this.weaponInterface = weaponInterface;
    }
}
