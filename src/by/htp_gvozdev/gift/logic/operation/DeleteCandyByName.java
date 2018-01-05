package by.htp_gvozdev.gift.logic.operation;

import java.util.Scanner;

import by.htp_gvozdev.gift.logic.*;

public class DeleteCandyByName {

	@SuppressWarnings("resource")
	public static void deleteCandy() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line number to remove the sweets:");
		int indexCandyUser = sc.nextInt();

		ClearConsole.ClearCons();
		
		
		////////???????????????????
		if (Initialization.list.size() == 0) {
			System.out.println("**********Sorry, but the list is empty.**********");
		} else {

			Initialization.list.remove(indexCandyUser - 1);
		}

		Gift.showGift(Initialization.list);
		Gift.getGiftTotalOnChange();
		Menu.viewMenu();
	}

}
