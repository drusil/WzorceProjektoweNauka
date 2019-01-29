package Characters;

import AbstractClasses.GameCharacter;
import WeaponInterface.BattleAxeBehavior;

public class Troll extends GameCharacter {
    public Troll() {
        super(new BattleAxeBehavior());
    }
}
