package WeaponInterface;

public class KnifeBehavior implements WeaponInterface.WeaponInterface {
    @Override
    public void useWeapon() {
        System.out.println("Stab!");
    }
}
