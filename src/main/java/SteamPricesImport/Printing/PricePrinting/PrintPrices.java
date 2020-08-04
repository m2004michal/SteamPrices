package SteamPricesImport.Printing.PricePrinting;

import SteamPricesImport.Array.ItemsArray.ItemsArray;
import SteamPricesImport.Item.Item;
import SteamPricesImport.ReadingFromUrl.JsonReader;

public class PrintPrices {

    public static void printPrices() {
        JsonReader jsonReader = new JsonReader();

        for (Item i : ItemsArray.items) {
            try {
                System.out.println(jsonReader.readPriceFromName(i.getId(), i.getMarketHashName()));
            } catch (RuntimeException e) {
                System.err.println("Wrong saved File: " + "'" + i.getMarketHashName() + "'");
            }
        }
    }

}
