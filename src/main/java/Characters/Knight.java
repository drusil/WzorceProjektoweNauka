package Characters;

import AbstractClasses.GameCharacter;
import WeaponInterface.BowAndArrowsBehavior;

public class Knight extends GameCharacter {

    public Knight() {
        super(new BowAndArrowsBehavior());
    }
}
