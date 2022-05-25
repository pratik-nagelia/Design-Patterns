package strategy.duck.fly;

public class FlyNotPossible implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Can't FLy");
    }
}
