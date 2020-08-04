package SteamPricesImport.FileSavingLoadingEtc;

import java.io.File;
import java.io.IOException;

public class FileCreator {
    String fileName = "followedItems.txt";
    File file = new File(fileName);
    public boolean fileExists = file.exists();

    public void createFile() {
        if (!fileExists) {
            try {
                fileExists = file.createNewFile();
            } catch (IOException e) {
                System.out.println("Nie udało się utworzyć pliku");
            }
        }
        if (fileExists)
            System.out.println("Plik " + fileName + " istnieje lub został utworzony");


    }
}


