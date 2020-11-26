import java.util.Scanner;

public class ItemClient {
    static ItemService itemService = new ItemServiceImpl();

    public static void itemsMain() {
        Item vivo = new Item(1, "vivo", 20000);
        Item oppo = new Item(2, "Oppo", 14000);
        Item iphone = new Item(3, "Iphone", 14000);

        System.out.println("Please select the option");
        System.out.println("1 -> Save");
        System.out.println("2 -> List");
        System.out.println("3 -> Fetch Item by id");
        System.out.println("4 -> Delete Item by id");

        Scanner sc1 = new Scanner(System.in);
        int option = sc1.nextInt();

        switch (option) {
            case 1:
                itemService.saveItem(vivo);
                itemService.saveItem(oppo);
                itemService.saveItem(iphone);
                break;

            case 2:
                Item[] allItems = itemService.fetchItems();
                for (Item i : allItems) {
                    if (i != null) {
                        System.out.println("Items : " + i.getName());
                    }
                }

                break;

            case 3:
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter id");
                int id = sc.nextInt();
                Item fetchedItem = itemService.findItemById(id);
                System.out.println("Fetched item by id : " + fetchedItem);

                break;

            case 4:
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Enter id");
                int id1 = sc2.nextInt();
                itemService.deleteItemById(id1);

                break;
            default:
                itemService.saveItem(oppo);

        }
        itemsMain();
        sc1.close();

    }

    public static void main(String args[]) {

        itemsMain();

    }
}