package SteamPricesImport.FileSavingLoadingEtc;

import SteamPricesImport.Array.ItemsArray.ItemsArray;
import SteamPricesImport.Item.Item;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class FileReader {

    public ArrayList<Item> readItems = new ArrayList<>();

    public ArrayList<Item> readFile() {

        String fileName = "followedItems.txt";
        try (
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            Item item;
            do {
                item = (Item) ois.readObject();
                ItemsArray.items.add(item);
            } while (item != null);
        } catch (ClassNotFoundException | IOException e) {
        }
        if (!ItemsArray.items.isEmpty()) System.out.println("Wczytano dane");

        return ItemsArray.items;
    }

}
