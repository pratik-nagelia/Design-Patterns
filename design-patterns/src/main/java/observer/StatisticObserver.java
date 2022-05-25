package observer;

public class StatisticObserver implements Observer{
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Updating Statistic observers");
    }
}
