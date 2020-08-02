//package SteamPricesImport.Array.ItemsArray;
//
//import SteamPricesImport.Item.Item;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.util.ArrayList;
//
//public class ReadItemFromFile {
//
//    public ArrayList<Item> readItemFromFile(){
//    ArrayList<Item> readItems = new ArrayList<>();
//        String fileName = "followedItems.txt";
//        ItemsArray itemsArray = new ItemsArray();
//        try (
//                FileInputStream fis = new FileInputStream(fileName);
//                ObjectInputStream ois = new ObjectInputStream(fis);
//        ) {
//            Item item;
//
//            item = (Item) ois.readObject();
//            readItems.add(item);
//
//        } catch (IOException ioException) {
//            ioException.printStackTrace();
//        } catch (ClassNotFoundException classNotFoundException) {
//            classNotFoundException.printStackTrace();
//        }
//        return itemsArray.items;
//    }
//}
