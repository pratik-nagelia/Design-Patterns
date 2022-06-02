package factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String sauce;
    List<String> toppings = new ArrayList<>();
    public abstract void bake();
    public abstract void display();
}
