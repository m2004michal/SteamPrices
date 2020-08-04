package SteamPricesImport;

import SteamPricesImport.EditingList.AddItemToList.AddItemToList;
import SteamPricesImport.EditingList.AddItemToList.AddItemToListFROMUSER;
import SteamPricesImport.Array.ItemsArray.ItemsArray;
import SteamPricesImport.EditingList.RemoveItemFromList.RemoveItemFromList;
import SteamPricesImport.GetItemIndex.GetItemIndex;
import SteamPricesImport.Item.Item;
import SteamPricesImport.FileSavingLoadingEtc.FileReader;
import SteamPricesImport.Printing.OptionsPrinting.PrintOptions;
import SteamPricesImport.Printing.PricePrinting.PrintPrices;
import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;

public class MainLoop {

    FileReader fileReader = new FileReader();

    public void mainLoop() {
        int loop = 0;


        final int option0 = 0;
        final int option1 = 1;
        final int option2 = 2;
        final int option5 = 5;

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





    public static void main(String[] args) {
        AddItemToList addItemToList = new AddItemToList();
        GetItemIndex getItemIndex = new GetItemIndex();
        System.out.println(
                getItemIndex.getItemIndex()
        );
    }
}
