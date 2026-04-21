public class JapaneseFactory implements AbstractFactory {

    public MainDish createMainDish() {
        return new Sushi();
    }

    public Drink createDrink() {
        return new Tea();
    }

    public Dessert createDessert() {
        return new Mochi();
    }
}