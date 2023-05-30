package shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {
    @Test
    void should_check_if_item_names_are_not_null_or_empty() {
        ShoppingListService shoppingList = new ShoppingListServiceImpl();

        List<Item> itemList = new LinkedList<>();
        itemList.add(new Item("Banana", 5));
        itemList.add(new Item("Apple", 3));


        assertDoesNotThrow(() -> shoppingList.saveItems(itemList));
    }
}
