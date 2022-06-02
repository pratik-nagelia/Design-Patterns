package factory;

public class NYCheesePizza extends Pizza {
    @Override
    public void bake() {
        System.out.println("NY Pizza Baking.....Its Ready");
    }

    @Override
    public void display() {
        System.out.println("NY Cheese Pizza");
    }
}
