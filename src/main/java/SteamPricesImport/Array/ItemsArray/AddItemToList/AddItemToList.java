package SteamPricesImport.Array.ItemsArray.AddItemToList;

import SteamPricesImport.Array.ItemsArray.ItemsArray;
import SteamPricesImport.Item.Item;

import java.util.ArrayList;

public class AddItemToList {

    public ArrayList<Item> addItemToList(Item newItem) {
        ItemsArray.items.add(newItem);
        return ItemsArray.items;
    }
}
