package SteamPricesImport.GetItemIndex;

import SteamPricesImport.Array.ItemsArray.ItemsArray;
import SteamPricesImport.FileSavingLoadingEtc.FileReader;
import SteamPricesImport.Item.Item;

import java.util.Scanner;

public class GetItemIndex {

    public int getItemIndex() {
        FileReader fileReader = new FileReader();
        fileReader.readFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter items name");
        String name = scanner.nextLine();
        int index = 0;
        for (Item item : ItemsArray.items) {
            if (item.getMarketHashName().equals(name)) {
                return index;
            }
            index++;
        }
        return index;
    }
}
