package Characters.Character;


import Characters.AbstractClasses.GameCharacter;
import Characters.WeaponInterface.BattleAxeBehavior;

public class Troll extends GameCharacter {
    public Troll() {
        super(new BattleAxeBehavior());
    }
}
