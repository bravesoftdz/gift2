package by.htp_gvozdev.gift.logic.operation;

import by.htp_gvozdev.gift.logic.Constant;

public class ClearConsole {
	public static void ClearCons() {
		for (int q = 0; q < 100; q++)
			System.out.println();

		System.out.print("");

		for (int q = 0; q < 32; q++) {
			for (long i = 0; i < 99999999; i++)

				;
			System.out.print((char) Constant.CONST_BY_VISIBLE_PROGRESS + "" + (char) Constant.CONST_BY_VISIBLE_PROGRESS);
		}

		System.out.println();

	}
}
