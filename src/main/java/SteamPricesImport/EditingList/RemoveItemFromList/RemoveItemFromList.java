package SteamPricesImport.EditingList.RemoveItemFromList;

import SteamPricesImport.Array.ItemsArray.ItemsArray;
import SteamPricesImport.GetItemIndex.GetItemIndex;
import SteamPricesImport.Item.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveItemFromList {

    public static ArrayList<Item> deleteItem(){
        GetItemIndex getItemIndex = new GetItemIndex();
        ItemsArray.items.remove(getItemIndex.getItemIndex());
        return ItemsArray.items;
    }

}
