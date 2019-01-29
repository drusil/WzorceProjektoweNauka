package SuperClasses;

import SuperClasses.FlyingInterface.FlyingInterface;
import SuperClasses.QuackInterface.QuackInterface;

public class Duck {

    FlyingInterface flyingInterface;
    QuackInterface quackInterface;

    public Duck(FlyingInterface flyingInterface, QuackInterface quackInterface) {
        this.flyingInterface = flyingInterface;
        this.quackInterface = quackInterface;
    }

    public void fly() {
        flyingInterface.fly();

    }

    public void quack(){
        quackInterface.quack();
    }

    public void setFlyingInterface(FlyingInterface flyingInterface) {
        this.flyingInterface = flyingInterface;
    }

    public void setQuackInterface(QuackInterface quackInterface) {
        this.quackInterface = quackInterface;
    }

    public void description(){
        System.out.println(this.getClass().getName());
    }
}
