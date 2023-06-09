package shop;

import java.util.List;

public class ShoppingListServiceImpl implements ShoppingListService{
    final ShoppingListDAO shoppingListDAO;

    // Dependancy Injection
    public ShoppingListServiceImpl(ShoppingListDAO shoppingListDAO) {
        this.shoppingListDAO = shoppingListDAO;
    }

    @Override
    public List<Item> findAll() {
        // Get all items from DB : any logic
        return shoppingListDAO.findAllItems();
    }

    @Override
    public void saveItems(List<Item> items) {
        // Check items:
            // check if item name is not null or empty
            // quantity >= 0
            // quantity < 100
        // Save all items in DB
        for (Item item : items){
            item.check();
        }
        shoppingListDAO.saveItems(items);
    }
}
