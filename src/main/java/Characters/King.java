package Characters;

import AbstractClasses.GameCharacter;
import WeaponInterface.SwordBehavior;

public class King extends GameCharacter {
    public King() {
        super(new SwordBehavior());
    }
}
