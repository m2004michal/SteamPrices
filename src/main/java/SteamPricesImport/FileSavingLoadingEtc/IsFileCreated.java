package SteamPricesImport.FileSavingLoadingEtc;

public class IsFileCreated {

    public void isFileCreated() {
        FileCreator fileCreator = new FileCreator();
        if (!fileCreator.fileExists) {
            fileCreator.createFile();
            System.out.println("Created file");
        }
    }

}
