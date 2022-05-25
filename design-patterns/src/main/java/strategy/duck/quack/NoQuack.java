package strategy.duck.quack;

public class NoQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("No Quack");
    }
}
