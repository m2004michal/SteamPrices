package SteamPricesImport;

import SteamPricesImport.AddItemToList.AddItemToListFROMUSER;
import SteamPricesImport.Array.ItemsArray.ItemsArray;
import SteamPricesImport.Item.Item;
import SteamPricesImport.Printing.PricePrinting.PrintPrices;

import java.util.ArrayList;
import java.util.Scanner;

public class MainLoop {

    public void mainLoop(){
        int loop = 0;
        Scanner scanner = new Scanner(System.in);

        while (loop!=-1){

            int option = scanner.nextInt();
            switch (option) {
                case 0:
                PrintPrices.printPrices();
                case 1:
                    AddItemToListFROMUSER addItemToListFROMUSER = new AddItemToListFROMUSER();
                    addItemToListFROMUSER.addItemToListFROMUSER();
                case 2:

                    ItemsArray.items.remove(2);
                case 5:
                    loop = -1;
                    scanner.close();


            }

        }

    }

    public ArrayList<Item> deleteItem(){

        return ItemsArray.items;
    }

}
