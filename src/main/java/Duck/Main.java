import Ducks.ModelDuck;
import Ducks.RubberDuck;
import Ducks.WildDuck;
import SuperClasses.FlyingInterface.ICantFly;
import SuperClasses.FlyingInterface.IHaveWingsSoIFly;
import SuperClasses.QuackInterface.Quack;

public class Main {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        RubberDuck rubberDuck = new RubberDuck();
        ModelDuck modelDuck = new ModelDuck();

        wildDuck.description();
        wildDuck.fly();
        wildDuck.quack();


        rubberDuck.description();
        rubberDuck.fly();
        rubberDuck.quack();

        System.out.println("Lets change some properties");
        modelDuck.fly();
        modelDuck.setFlyingInterface(new ICantFly());
        modelDuck.fly();
        modelDuck.setFlyingInterface(new IHaveWingsSoIFly());
        modelDuck.fly();

        modelDuck.quack();
        modelDuck.setQuackInterface(new Quack());
        modelDuck.quack();
    }
}
