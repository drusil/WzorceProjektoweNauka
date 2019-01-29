package SuperClasses.FlyingInterface;

public class ICantFly implements FlyingInterface {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
