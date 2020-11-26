import java.util.Arrays;

public class ItemServiceImpl implements ItemService {

    private Item[] items = new Item[10];
    private static int counter = 0;

    public void saveItem(Item item) {
        items[counter++] = item;
        // counter++;
    }

    public Item[] fetchItems() {
        System.out.println(Arrays.toString(items));
        return this.items;
    }

    public Item findItemById(long itemId) {
        for (int index = 0; index < 10; index++) {
            if (items[index].getItemId() == itemId)
                return items[index];
        }
        return null;
    }

    public void deleteItemById(long itemId) {
        Item[] temp = new Item[10];
        for (int index = 0; index < 10; index++) {
            temp[index] = this.items[index];
        }
        ItemServiceImpl.counter = 0;

        for (int index = 0; index < 10; index++) {
            items[index] = null;
        }

        for (int index = 0; index < 10 && temp[index] != null; index++) {
            if (temp[index].getItemId() != itemId) {
                this.saveItem(temp[index]);
            }
        }
        System.out.println("Deleted Successfully");
    }

}