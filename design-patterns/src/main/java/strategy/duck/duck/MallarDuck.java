package strategy.duck.duck;

import strategy.duck.fly.FlyWithWings;
import strategy.duck.quack.NoQuack;

public class MallarDuck extends Duck {
    public MallarDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new NoQuack();
    }

    public void display() {
        System.out.println("I am a Mallard Duck");
    }
}
