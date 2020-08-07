package SteamPricesImport.ConvertingPrices;

import SteamPricesImport.Item.Item;

import static SteamPricesImport.ReadingFromUrl.JsonReader.returnPriceString;


public class ConvertPriceStringToDouble {
    public double convertPriceStringToDouble(Item item) {
        String price = returnPriceString(item.getId(), item.getMarketHashName());
        String[] result = price.split("z");
        String[] result1 = result[0].split(",");
        String price1 = result1[0] + result1[1];
        double priceDouble = (Double.parseDouble(price1) / 100 * item.getQuantity());


        priceDouble = roundDouble(priceDouble);

        return priceDouble;
    }
    private static double roundDouble(double d){
        d = d*100;
        d = Math.round(d);
        d = d /100;
        return d;
    }
}
