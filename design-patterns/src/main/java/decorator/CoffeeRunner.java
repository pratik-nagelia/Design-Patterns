package decorator;

public class CoffeeRunner {
    public static void main(String[] args) {
        Beverage beverage = new Expresso();

        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage topping1 = new Mocha(beverage);
        System.out.println(topping1.getDescription() + " $" + topping1.cost());

        Beverage topping2 = new Whip(topping1);
        System.out.println(topping2.getDescription() + " $" + topping2.cost());
    }
}
