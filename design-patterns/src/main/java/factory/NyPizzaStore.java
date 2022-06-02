package factory;

public class NyPizzaStore implements PizzaStore{
    @Override
    public Pizza createPizza() {
        return new NYCheesePizza();
    }
}
