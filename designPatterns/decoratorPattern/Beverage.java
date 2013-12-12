package decoratorPattern;

public abstract class Beverage {

    String descriptionString = "Unknown Beverage";

    public String getDescrption() {
        return descriptionString;
    }

    public abstract double cost();
}
