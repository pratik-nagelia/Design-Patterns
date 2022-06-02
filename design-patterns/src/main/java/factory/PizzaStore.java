package factory;

public interface PizzaStore {
    default Pizza orderPizza() {
        Pizza pizza  = createPizza();
        pizza.bake();
        return pizza;
    }

    Pizza createPizza();
}
