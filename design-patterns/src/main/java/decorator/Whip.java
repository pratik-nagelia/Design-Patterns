package decorator;

public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.6;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Whip";
    }
}
