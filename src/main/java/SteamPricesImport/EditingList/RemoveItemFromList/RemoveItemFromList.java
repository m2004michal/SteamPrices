package SteamPricesImport.EditingList.RemoveItemFromList;

import SteamPricesImport.Array.ItemsArray.ItemsArray;
import SteamPricesImport.GetItemIndex.GetItemIndex;
import SteamPricesImport.Item.Item;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveItemFromList {
    private static Scanner sc = new Scanner(System.in);

    public static ArrayList<Item> deleteItem() {
        Iterator<Item> itemIterator = ItemsArray.items.iterator();
        System.out.println("Enter item name");
        String input = sc.nextLine();
        while (itemIterator.hasNext()){
            String name = itemIterator.next().getMarketHashName();
            if (name.equals(input)){
                itemIterator.remove();
            }
        }
        return ItemsArray.items;
    }

}
