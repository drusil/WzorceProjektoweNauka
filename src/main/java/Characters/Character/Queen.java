package Characters.Character;


import Characters.AbstractClasses.GameCharacter;
import Characters.WeaponInterface.KnifeBehavior;

public class Queen extends GameCharacter {
    public Queen() {
        super(new KnifeBehavior());
    }
}
