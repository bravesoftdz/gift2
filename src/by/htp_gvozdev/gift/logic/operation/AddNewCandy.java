package by.htp_gvozdev.gift.logic.operation;


import java.util.Scanner;

import by.htp_gvozdev.gift.bean.Marshmallow;
import by.htp_gvozdev.gift.logic.*;
public class AddNewCandy {
	@SuppressWarnings("resource")
	public static void addCandy() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name candy.");
		String nameCandyUser = sc.nextLine();

		System.out.println("Enter the type candy.");
		String typeCandyUser = sc.nextLine();

		System.out.println("Enter the price candy.");
		double priceCandyUser = sc.nextDouble();

		System.out.println("Enter the weight candy.");
		int weightCandyUser = sc.nextInt();

		System.out.println("Enter the content sugar in candy.");
		double contCandyUser = sc.nextDouble();

		Initialization.list.add(new Marshmallow(nameCandyUser, typeCandyUser, priceCandyUser, weightCandyUser, contCandyUser));
		
		ClearConsole.ClearCons();

		System.out.println("                   A NEW ITEM HAS BEEN ADDED                    ");
		System.out.println("----------------------------------------------------------------");
		System.out.printf("%5s %15s %15s %8s %8s %8s \t \n", " No" + "|", "NAME" + "|", "TYPE" + "|", "COST" + "|",
				"WEIGHT" + "|", "CONTENT" + "|");
		System.out.println("----------------------------------------------------------------");
		System.out.printf("%5s %15s %15s %8s %8s %8s \t \n", "1|", nameCandyUser + "|", typeCandyUser + "|",
				priceCandyUser + "|", weightCandyUser + "|", contCandyUser + "|");
		System.out.println("----------------------------------------------------------------");

		Gift.showGift(Initialization.list);
		Gift.getGiftTotalOnChange();

		Menu.viewMenu();
	}
}
