package decoratorPattern;

public class StarBuzzCoffee {

    public static void main(String args[]) {
        Beverage coffee = new Expresso();
        CondimentDecorator mocha = new Mocha(coffee);
        CondimentDecorator mocha2 = new Mocha(coffee);

        System.out.print(coffee.cost());
    }

}
