package strategy.duck.fly;

public class FlyWithWings implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Flying with Wings");
    }
}
