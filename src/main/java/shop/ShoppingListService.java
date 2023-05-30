package shop;

import java.util.List;

public interface ShoppingListService {
    List<Item> findAll();
    void saveItems(List<Item> items);
}
