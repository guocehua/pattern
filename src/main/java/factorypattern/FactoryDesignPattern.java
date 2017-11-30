package factorypattern;

public class FactoryDesignPattern {

    public static Car getCar(String cartype) {
        if (cartype == null) {
            return null;
        }
        if ("bwm".equals(cartype)) {
            return new BWM();
        }
        if ("benz".equals(cartype)) {
            return new BenZ();
        }
        return null;
    }
}
