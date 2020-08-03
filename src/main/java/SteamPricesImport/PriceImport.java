package SteamPricesImport;
import SteamPricesImport.Array.ItemsArray.AddItemToList.AddItemToList;
import SteamPricesImport.Array.ItemsArray.AddItemToList.AddItemToListFROMUSER;
import SteamPricesImport.Array.ItemsArray.ItemsArray;
import SteamPricesImport.FileSavingLoadingEtc.FileWriter;
import SteamPricesImport.Item.Item;
import SteamPricesImport.PricePrinting.PrintPrices;
import java.io.IOException;

public class PriceImport {



    public static void main(String[] args) {

      MainLoop mainLoop = new MainLoop();
      mainLoop.mainLoop();

      AddItemToList addItemToList = new AddItemToList();
      addItemToList.addItemToList(new Item("730", "AK-47 | Redline (Field-Tested)", 32));
      addItemToList.addItemToList(new Item("730", "Shattered Web Case", 32));
      addItemToList.addItemToList(new Item("730", "Error Generating case", 32));
      addItemToList.addItemToList(new Item("730", "AWP | Atheris (Field-Tested)", 32));
      addItemToList.addItemToList(new Item("730", "Glove Case", 32));

 //     System.out.println(itemsArray.getArray());

//      AddItemToListFROMUSER addItemToListFROMUSER = new AddItemToListFROMUSER();
//      addItemToListFROMUSER.addItemToListFROMUSER();
      FileWriter fileWriter = new FileWriter();
      fileWriter.writeFile(ItemsArray.items);



        PrintPrices.printPrices();



    }
}