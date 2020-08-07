package SteamPricesImport.ConvertingPrices;

import SteamPricesImport.Item.Item;
public class ReturnItemWithPrice {
    public static String returnItemWithPrice(Item item){
        var convertPriceStringToDouble = new ConvertPriceStringToDouble();
        var convertPriceToString = new ConvertPriceToString();
        return "Quantity:" + item.getQuantity() + " Price: " + convertPriceToString.convertPriceToString(convertPriceStringToDouble.convertPriceStringToDouble(item));
    }
}
