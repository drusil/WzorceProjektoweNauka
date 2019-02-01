package Characters.WeaponInterface;

public class KnifeBehavior implements WeaponInterface {
    @Override
    public void useWeapon() {
        System.out.println("Stab!");
    }
}
