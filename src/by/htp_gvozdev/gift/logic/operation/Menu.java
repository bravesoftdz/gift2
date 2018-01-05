package by.htp_gvozdev.gift.logic.operation;

import java.util.Scanner;

import by.htp_gvozdev.gift.logic.ChoisToSort;
import by.htp_gvozdev.gift.logic.Constant;
import by.htp_gvozdev.gift.logic.Gift;
import by.htp_gvozdev.gift.runner.MainApp;

public class Menu {

	static Scanner scanner = new Scanner(System.in);

	public static void viewMenu() {

		System.out.println();
		System.out.println("===============================================");
		System.out.println("|                     MENU                    |");
		System.out.println("===============================================");
		System.out.println("|    Select item fo menu for work:            |");
		System.out.println("|        1. Add new item to list.             |");
		System.out.println("|        2. Delete item form list.            |");
		System.out.println("|        3. Sort list                         |");
		System.out.println("|        4. Find range in content sugar       |");
		System.out.println("|        5. Print to file                     |");
		System.out.println("|        6. Exit                              |");
		System.out.println("===============================================");

		int menuItem = scanner.nextInt();

		if (menuItem == 1) {
			AddNewCandy.addCandy();
		}
		if (menuItem == 2) {
			DeleteCandyByName.deleteCandy();
		}
		if (menuItem == 3) {
			createSubMenu();
		} else if (menuItem == 4) {
			FindRange.getFind();
		} else if (menuItem == 5) {
			PrintToFile.printFile();
		} else if (menuItem == 6) {
			ClearConsole.ClearCons();
			System.out.println("The program is closed.");
			System.exit(0);
		} else {
			viewMenu();
		}

	}

	public static void createSubMenu() {
		System.out.println("         =========================================");
		System.out.println("         |    Choose what to do sorting:         |");
		System.out.println("         |        1. Sort by price.              |");
		System.out.println("         |        2. Sort by weight.             |");
		System.out.println("         |        3. Sort by content sugar.      |");
		System.out.println("         |        4. Cancel.                     |");
		System.out.println("         =========================================");

		int subMenuItem = scanner.nextInt();
		if (subMenuItem == 1) {
			ChoisToSort.getSort(Constant.CONST_BY_SORT_PRICE);
		}
		if (subMenuItem == 2) {
			ChoisToSort.getSort(Constant.CONST_BY_SORT_WEIGHT);
		}
		if (subMenuItem == 3) {
			ChoisToSort.getSort(Constant.CONST_BY_SORT_SUGAR);
		} else if (subMenuItem == 4) {
			ClearConsole.ClearCons();
			Gift.showGift(MainApp.list);
			Gift.getGiftTotalOnChange();
			viewMenu();
		} else {
			createSubMenu();
		}
	}

}
