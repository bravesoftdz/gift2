package by.htp_gvozdev.gift.logic;

import by.htp_gvozdev.gift.logic.operation.ClearConsole;
import by.htp_gvozdev.gift.logic.operation.Menu;
import by.htp_gvozdev.gift.runner.MainApp;

public class ChoisToSort {

	public static void getSort(String value) {
		if (value == "price") {
			ClearConsole.ClearCons();
			Compare.sortByCost();
			System.out.println("\n*The table is sorted by " + value + ".");
			Gift.showGift(MainApp.list);
			Menu.viewMenu();
		} else if (value == "weight") {
			ClearConsole.ClearCons();
			Compare.sortByWeight();
			System.out.println("\n*The table is sorted by " + value + ".");
			Gift.showGift(MainApp.list);
			Menu.viewMenu();
		} else if (value == "content sugar") {
			ClearConsole.ClearCons();
			Compare.sortByConsSuga();
			System.out.println("\n*The table is sorted by " + value + ".");
			Gift.showGift(MainApp.list);
			Menu.viewMenu();
		}
	}

}
