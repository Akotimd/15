import java.util.Arrays;
import java.util.Objects;

public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Order[customer=" + customer + ", products=" + Arrays.toString(basket) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        Order ord = (Order) obj;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!Objects.equals(customer, ord.customer)) {
            return false;  //
        }
        if (basket == null && ord.basket == null) {
            return true;
        }
        if (basket == null || ord.basket == null) {
            return false;
        }
        if (basket.length != ord.basket.length) {
            return false;
        }
        for (int i = 0; i < basket.length; i++) {
            Product basketItem = basket[i];
            Product basketItem1 = ord.basket[i];
            if (!Objects.equals(basketItem, basketItem1)) {
                return false;
            }
        }
        return true;
    }

}
