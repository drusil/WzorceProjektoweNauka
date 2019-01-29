package SuperClasses.FlyingInterface;

public class IHaveWingsSoIFly implements FlyingInterface {
    @Override
    public void fly() {
        System.out.println("I fly on the sky");
    }
}
