package Characters.WeaponInterface;

public class SwordBehavior implements WeaponInterface {
    @Override
    public void useWeapon() {
        System.out.println("Cut!");
    }
}
