public class AmericanFactory implements AbstractFactory {

    public MainDish createMainDish() {
        return new Burger();
    }

    public Drink createDrink() {
        return new Cola();
    }

    public Dessert createDessert() {
        return new IceCream();
    }
}
