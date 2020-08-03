package SteamPricesImport;

import SteamPricesImport.PricePrinting.PrintPrices;

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
                case 5:
                    loop = -1;
                    scanner.close();


            }

        }

    }
    public void printOptions(){
        System.out.println("[0]" + " - Print prices of followed items");
    }
}
