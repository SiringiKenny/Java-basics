public interface ItemService {

    public void saveItem(Item item);

    public Item[] fetchItems();

    public Item findItemById(long itemId);

    public void deleteItemById(long itemId);
}