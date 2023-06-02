package shop;

import java.util.List;

public interface ShoppingListDAO {
    List<Item> findAll();
    void saveItems(List<Item> items);
}
