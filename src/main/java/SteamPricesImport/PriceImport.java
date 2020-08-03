package SteamPricesImport;
import SteamPricesImport.AddItemToList.AddItemToList;
import SteamPricesImport.Array.ItemsArray.ItemsArray;
import SteamPricesImport.FileSavingLoadingEtc.FileWriter;
import SteamPricesImport.GetItemIndex.GetItemIndex;
import SteamPricesImport.Item.Item;
import SteamPricesImport.Printing.PricePrinting.PrintPrices;
import com.sun.tools.javac.Main;

public class PriceImport {



    public static void main(String[] args) {

//      MainLoop mainLoop = new MainLoop();
//      mainLoop.mainLoop();

      AddItemToList addItemToList = new AddItemToList();
      addItemToList.addItemToList(new Item("730", "AK-47 | Redline (Field-Tested)", 32));
      addItemToList.addItemToList(new Item("730", "Shattered Web Case", 32));
      addItemToList.addItemToList(new Item("730", "Error Generating Case", 32));
      addItemToList.addItemToList(new Item("730", "AWP | Atheris (Field-Tested)", 32));
      addItemToList.addItemToList(new Item("730", "Glove Case", 32));

      FileWriter fileWriter = new FileWriter();
      fileWriter.writeFile(ItemsArray.items);

//        MainLoop mainLoop = new MainLoop();
        GetItemIndex getItemIndex = new GetItemIndex();
        System.out.println(getItemIndex.getItemIndex());
      System.out.println(ItemsArray.items.toString());

//      AddItemToListFROMUSER addItemToListFROMUSER = new AddItemToListFROMUSER();
//      addItemToListFROMUSER.addItemToListFROMUSER();
//     ItemsArray.items.remove(2);


//
//
//
//       PrintPrices.printPrices();



    }
}