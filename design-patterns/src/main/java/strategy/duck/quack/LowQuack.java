package strategy.duck.quack;

public class LowQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Low Quack");
    }
}
