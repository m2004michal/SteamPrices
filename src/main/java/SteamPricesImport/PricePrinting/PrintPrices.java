package SteamPricesImport.PricePrinting;

import SteamPricesImport.FileSavingLoadingEtc.FileReader;
import SteamPricesImport.Item.Item;
import SteamPricesImport.ReadingFromUrl.JsonReader;

public class PrintPrices {

    public void printPrices() {
        FileReader fileReader = new FileReader();
        fileReader.readFile();
        JsonReader jsonReader = new JsonReader();

        for (Item i : fileReader.readItems) {
            try {
                System.out.println(jsonReader.readPriceFromName(i.getId(), i.getMarketHashName()));
            }catch (RuntimeException e){
                System.err.println("Wrong saved File: " + "'" + i.getMarketHashName() + "'");
            }
        }
    }

}
