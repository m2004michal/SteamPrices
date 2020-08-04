package SteamPricesImport.EditingList.AddItemToList;

import SteamPricesImport.Array.ItemsArray.ItemsArray;
import SteamPricesImport.Item.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class AddItemToListFROMUSER {

    public ArrayList<Item> addItemToListFROMUSER() {
        String id;
        String MarketHashName;
        int quantity;
        Scanner scanner = new Scanner(System.in);
        AddItemToList addItemToList = new AddItemToList();
        System.out.println("Enter item id: ");
        id = scanner.nextLine();
        System.out.println("Enter item market name: ");
        MarketHashName = scanner.nextLine();
        System.out.println("Enter quantity: ");
        quantity = scanner.nextInt();
        Item item = new Item(id, MarketHashName, quantity);
        addItemToList.addItemToList(item);
        return ItemsArray.items;
    }

}
