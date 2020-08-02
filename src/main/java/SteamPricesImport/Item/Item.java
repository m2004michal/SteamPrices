package SteamPricesImport.Item;

import java.io.Serializable;

public class Item implements Serializable {
    private static final long serialVersionUID = 3812017177088226528L;

    private String id;
    private String marketHashName;
    private int quantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarketHashName() {
        return marketHashName;
    }

    public void setMarketHashName(String marketHashName) {
        this.marketHashName = marketHashName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item(String id, String marketHashName, int quantity) {
        setId(id);
        setMarketHashName(marketHashName);
        setQuantity(quantity);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", market_hash_name='" + marketHashName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
