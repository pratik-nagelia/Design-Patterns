package strategy.duck.duck;

import strategy.duck.fly.FlyBehaviour;
import strategy.duck.quack.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public abstract void display();
}
