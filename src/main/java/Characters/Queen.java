package Characters;


import AbstractClasses.GameCharacter;
import WeaponInterface.KnifeBehavior;

public class Queen extends GameCharacter {
    public Queen() {
        super(new KnifeBehavior());
    }
}
