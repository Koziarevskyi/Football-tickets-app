package football.service;

import football.model.Order;
import football.model.ShoppingCart;
import football.model.User;
import java.util.List;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
