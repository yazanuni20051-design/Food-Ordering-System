import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public void showCart() {
        System.out.println("Your Order:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }
}
