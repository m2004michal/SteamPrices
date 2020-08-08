package SteamPricesImport;

import SteamPricesImport.EditingList.MainLoop.MainLoop;

public class SteamTrackerMain {
    public static void main(String[] args) {
        MainLoop mainLoop = new MainLoop();
        mainLoop.mainLoop();
    }
}