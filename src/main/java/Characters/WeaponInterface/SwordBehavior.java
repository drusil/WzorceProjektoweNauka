package WeaponInterface;

public class SwordBehavior implements WeaponInterface.WeaponInterface {
    @Override
    public void useWeapon() {
        System.out.println("Cut!");
    }
}
