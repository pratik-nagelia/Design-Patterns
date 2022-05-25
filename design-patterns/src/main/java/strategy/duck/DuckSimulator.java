package strategy.duck;

import strategy.duck.duck.Duck;
import strategy.duck.duck.MallarDuck;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallarDuck();
        duck.performQuack();
        duck.performFly();
        duck.display();
    }
}
