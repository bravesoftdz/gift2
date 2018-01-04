package by.htp_gvozdev.gift.logic.operation;

import java.util.Scanner;

import by.htp_gvozdev.gift.logic.Gift;
import by.htp_gvozdev.gift.runner.MainApp;

public class DeleteCandyByName {

	@SuppressWarnings("resource")
	public static void deleteCandy() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line number to remove the sweets:");
		int indexCandyUser = sc.nextInt();

		ClearConsole.ClearCons();
		
		
		////////???????????????????
		if (MainApp.list.size() == 0) {
			System.out.println("**********Sorry, but the list is empty.**********");
		} else {

			MainApp.list.remove(indexCandyUser - 1);
		}

		Gift.showGift(MainApp.list);
		Gift.getGiftTotalOnChange();
		Menu.viewMenu();
	}

}
