package decoratorPattern;

public class Expresso extends Beverage {

    @Override
    public double cost() {
        // TODO Auto-generated method stub
        return 2;
    }

    public Expresso() {
        descriptionString = "Expresso";
    }

}
