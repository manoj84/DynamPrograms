package decoratorPattern;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    @Override
    public String getDescritpion() {
        return beverage.getDescrption() + " , Mocha";
    }

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return 0.2 + beverage.cost();
    }

}
