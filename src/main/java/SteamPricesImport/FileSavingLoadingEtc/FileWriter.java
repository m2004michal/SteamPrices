package SteamPricesImport.FileSavingLoadingEtc;

import SteamPricesImport.Item.Item;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileWriter {

    public void writeFile(ArrayList<Item> items) {

        String fileName = "followedItems.txt";


        try (
                var fs = new FileOutputStream(fileName);
                var os = new ObjectOutputStream(fs)
        ) {
            for (Item item : items) {
                os.writeObject(item);
            }

            System.out.println("Zapisano obiekt do pliku");

        } catch (IOException e) {
            System.err.println("Bład zapisu pliku " + fileName);
            e.printStackTrace();
        }
    }
}



