package SteamPricesImport.FileSavingLoadingEtc;

import java.io.File;
import java.io.IOException;

public class FileCreator {
    public void createFile() {
        String fileName = "followedItems.txt";
        File file = new File(fileName);

        boolean fileExists = file.exists();
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


