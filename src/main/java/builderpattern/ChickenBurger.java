package builderpattern;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "chickenBurger";
    }

    @Override
    public float price() {
        return 0.1f;
    }
}
