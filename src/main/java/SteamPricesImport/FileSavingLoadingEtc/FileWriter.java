package SteamPricesImport.FileSavingLoadingEtc;

import SteamPricesImport.Item.Item;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileWriter {

    public static void writeFile(ArrayList<Item> items) {
        String fileName = "followedItems.txt";
        try (
                var fs = new FileOutputStream(fileName);
                var os = new ObjectOutputStream(fs)
        ) {
            for (Item item : items) {
                os.writeObject(item);
            }

            System.out.println("Succesfuly saved file");

        } catch (IOException e) {
            System.err.println("Error occured while trying to save:  " + fileName);
            e.printStackTrace();
        }
    }
}



