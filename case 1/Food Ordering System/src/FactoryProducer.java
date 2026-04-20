public class FactoryProducer {

    public static AbstractFactory getFactory(int choice) {
        switch (choice) {
            case 1:
                return new AmericanFactory();
            case 2:
                return new ItalianFactory();
            case 3:
                return new JapaneseFactory();
            default:
                throw new IllegalArgumentException("Invalid choice");
        }
    }
}
