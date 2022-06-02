package factory;

public class PizzaRunner {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NyPizzaStore();
        Pizza pizza = pizzaStore.orderPizza();
        pizza.display();
    }
}
