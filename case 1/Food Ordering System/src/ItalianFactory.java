public class ItalianFactory implements AbstractFactory {

    public MainDish createMainDish() {
        return new Pizza();
    }

    public Drink createDrink() {
        return new Juice();
    }

    public Dessert createDessert() {
        return new Tiramisu();
    }
}
