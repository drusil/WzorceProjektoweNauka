package Characters.Character;

import Characters.AbstractClasses.GameCharacter;
import Characters.WeaponInterface.BowAndArrowsBehavior;

public class Knight extends GameCharacter {

    public Knight() {
        super(new BowAndArrowsBehavior());
    }
}
