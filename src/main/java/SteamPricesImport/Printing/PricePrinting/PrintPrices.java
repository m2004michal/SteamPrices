package SteamPricesImport.Printing.PricePrinting;

import SteamPricesImport.Array.ItemsArray.ItemsArray;
import SteamPricesImport.ConvertingPrices.ConvertPriceStringToDouble;
import SteamPricesImport.ConvertingPrices.ConvertPriceToString;
import SteamPricesImport.ConvertingPrices.ReturnItemWithPrice;
import SteamPricesImport.Item.Item;
import SteamPricesImport.Printing.OptionsPrinting.PrintOptions;
import SteamPricesImport.ReadingFromUrl.JsonReader;

import java.text.DecimalFormat;

public class PrintPrices {

    public static void printPrices() {
        JsonReader jsonReader = new JsonReader();

        for (Item i : ItemsArray.items) {
            try {
                System.out.println(jsonReader.readPriceAndNameFromName(i.getId(), i.getMarketHashName()));
                System.out.println(ReturnItemWithPrice.returnItemWithPrice(i));
            } catch (RuntimeException e) {
                System.err.println("Wrong saved File: " + "'" + i.getMarketHashName() + "'");
            }
        }
    }

    public static void main(String[] args) {
        double priceDouble = 22.3123;
        double val = 22.32132;
        val = val*100;
        val = Math.round(val);
        val = val /100;
        System.out.println(val);
    }









}
