package SteamPricesImport.EditingList.MainLoop;

import SteamPricesImport.EditingList.AddItemToList.AddItemToListFROMUSER;
import SteamPricesImport.EditingList.RemoveItemFromList.RemoveItemFromList;
import SteamPricesImport.FileSavingLoadingEtc.IsFileCreated;
import SteamPricesImport.FileSavingLoadingEtc.FileReader;
import SteamPricesImport.Printing.OptionsPrinting.PrintOptions;
import SteamPricesImport.Printing.PricePrinting.PrintPrices;

import java.lang.*;
import java.util.Scanner;

public class MainLoop {

    FileReader fileReader = new FileReader();

    public void mainLoop() {
        int loop = 0;
        final int option0 = 0;
        final int option1 = 1;
        final int option2 = 2;
        final int option5 = 5;
        IsFileCreated isFileCreated = new IsFileCreated();
        isFileCreated.isFileCreated();

        fileReader.readFile();

        while (loop != -1) {

            PrintOptions.printOptions();
            Scanner s = new Scanner(System.in);
            int option = s.nextInt();

            switch (option) {
                case option0:
                    PrintPrices.printPrices();
                    break;
                case option1:
                    AddItemToListFROMUSER addItemToListFROMUSER = new AddItemToListFROMUSER();
                    addItemToListFROMUSER.addItemToListFROMUSER();
                    break;
                case option2:
                    RemoveItemFromList.deleteItem();
                    break;
                case option5:
                    loop = -1;
                    break;
                default:
                    System.out.println("There is no such option");
                    s.close();
            }
        }
    }
}
