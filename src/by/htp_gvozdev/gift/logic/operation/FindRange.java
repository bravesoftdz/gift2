package by.htp_gvozdev.gift.logic.operation;

import java.util.Scanner;

import by.htp_gvozdev.gift.logic.*;

public class FindRange {

	static Scanner scanner = new Scanner(System.in);

	public static void getFind() {
		
		ClearConsole.ClearCons();

		System.out.println("Enter 1 selection parameter:");
		int menuItemFirst = scanner.nextInt();
		int v1 = menuItemFirst;

		System.out.println("Enter 1 selection parameter:");
		int menuItemSecond = scanner.nextInt();
		int v2 = menuItemSecond;

		Constant.CONST_BY_SUGAR_1 = v1;
		Constant.CONST_BY_SUGAR_2 = v2;

		Gift.getShowRange(Initialization.list);
		Gift.getGiftTotalOnChange();
	}

}
