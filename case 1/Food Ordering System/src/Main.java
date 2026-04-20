import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Menu:");
        System.out.println("1 - American");
        System.out.println("2 - Italian");
        System.out.println("3 - Japanese");

        int choice = scanner.nextInt();

        AbstractFactory factory = FactoryProducer.getFactory(choice);

        MainDish mainDish = factory.createMainDish();
        Drink drink = factory.createDrink();
        Dessert dessert = factory.createDessert();

        Cart cart = new Cart();
        cart.addItem(mainDish.getName());
        cart.addItem(drink.getName());
        cart.addItem(dessert.getName());

        cart.showCart();

        scanner.close();
    }
}
