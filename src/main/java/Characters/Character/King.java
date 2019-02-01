package Characters.Character;

import Characters.AbstractClasses.GameCharacter;
import Characters.WeaponInterface.SwordBehavior;

public class King extends GameCharacter {
    public King() {
        super(new SwordBehavior());
    }
}
