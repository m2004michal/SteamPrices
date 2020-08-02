package SteamPricesImport.ReadingFromUrl;

public class UrlCreator {

    public static String createURL(String id, String market_hash_name) {
        return "https://steamcommunity.com/market/priceoverview/=?currency=6&appid=" + id + "&market_hash_name=" + market_hash_name;
    }
}
