package SteamPricesImport.EditingList.AddItemToList;

import SteamPricesImport.Array.ItemsArray.ItemsArray;
import SteamPricesImport.FileSavingLoadingEtc.FileWriter;
import SteamPricesImport.Item.Item;

import java.util.ArrayList;

public class AddItemToList {
    public ArrayList<Item> addItemToList(Item newItem) {
        ItemsArray.items.add(newItem);
        FileWriter.writeFile(ItemsArray.items);
        return ItemsArray.items;
    }
}
