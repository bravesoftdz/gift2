package by.htp_gvozdev.gift.logic;

import java.util.ArrayList;

import by.htp_gvozdev.gift.bean.Production;
import by.htp_gvozdev.gift.logic.operation.Menu;

public class Gift {

	public static void getGiftTotalOnChange() {
		double sum = Gift.getTotalCost(Initialization.list);
		int heft = Gift.getTotalWeight(Initialization.list);
		double sSuga = Gift.getTotalConSuga(Initialization.list);

		System.out.printf("%37s %8s %8s %8s \t \n", "TOTAL" + "|", String.format("%.2f", sum) + "|", heft + "|",
				String.format("%.2f", sSuga) + "|");
		System.out.println("----------------------------------------------------------------");
		System.out.println("You were looking for sweets with a sugar content from " + Constant.CONST_BY_SUGAR_1 + " to "
				+ Constant.CONST_BY_SUGAR_2 + ".");
		System.out.println("The sweets found are marked with a \">\".");
		System.out.println();
		System.out.println();
		Menu.viewMenu();
	}

	@SuppressWarnings("unused")
	public static void getGift() {
		Gift gift = new Gift();
		ArrayList<Production> list = Initialization.setGift();
		Gift.showGift(list);
		double sum = Gift.getTotalCost(list);
		int heft = Gift.getTotalWeight(list);
		double sSuga = Gift.getTotalConSuga(list);

		System.out.printf("%37s %8s %8s %8s \t \n", "TOTAL" + "|", String.format("%.2f", sum) + "|", heft + "|",
				String.format("%.2f", sSuga) + "|");
		System.out.println("----------------------------------------------------------------");
		System.out.println("You were looking for sweets with a sugar content from " + Constant.CONST_BY_SUGAR_1 + " to "
				+ Constant.CONST_BY_SUGAR_2 + ".");
		System.out.println("The sweets found are marked with a \">\".");
		System.out.println();
		System.out.println();
		Menu.viewMenu();
	}

	public static void getShowRange(ArrayList<Production> list) {
		System.out.println();
		System.out.println("                        HEW YEAR'S GIFT                         ");
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.printf("%5s %15s %15s %8s %8s %8s \t \n", " No" + "|", "NAME" + "|", "TYPE" + "|", "COST" + "|",
				"WEIGHT" + "|", "CONTENT" + "|");
		System.out.println("----------------------------------------------------------------");
		int i = 1;
		for (Production value : list) {
			if (Constant.CONST_BY_SUGAR_1 > value.getConsSuga() || Constant.CONST_BY_SUGAR_2 < value.getConsSuga()) {
				System.out.printf("%5s %15s %15s %8s %8s %8s \t \n", i + "|", value.getName() + "|",
						value.getType() + "|", value.getCost() + "|", value.getWeight() + "|",
						value.getConsSuga() + "|");
			} else {
				System.out.printf("%5s %15s %15s %8s %8s %8s \t \n", i + "|", value.getName() + "|",
						value.getType() + "|", value.getCost() + "|", value.getWeight() + "|",
						">" + value.getConsSuga() + "|");
			}
			i++;
		}
		System.out.println("----------------------------------------------------------------");
	}

	public static void showGift(ArrayList<Production> list) {
		System.out.println();
		System.out.println("                        HEW YEAR'S GIFT                         ");
		System.out.println("----------------------------------------------------------------");
		System.out.printf("%5s %15s %15s %8s %8s %8s \t \n", " No" + "|", "NAME" + "|", "TYPE" + "|", "COST" + "|",
				"WEIGHT" + "|", "CONTENT" + "|");
		System.out.println("----------------------------------------------------------------");
		int i = 1;
		for (Production value : list) {
			System.out.printf("%5s %15s %15s %8s %8s %8s \t \n", i + "|", value.getName() + "|", value.getType() + "|",
					value.getCost() + "|", value.getWeight() + "|", value.getConsSuga() + "|");

			i++;
		}
		System.out.println("----------------------------------------------------------------");
	}

	public static double getTotalConSuga(ArrayList<Production> list) {
		double sumConSuga = 0;
		for (Production value : list) {
			sumConSuga += value.getConsSuga();
		}
		return sumConSuga;
	}

	public static double getTotalCost(ArrayList<Production> list) {
		double sum = 0;
		for (Production value : list) {
			sum += value.getCost();
		}
		return sum;

	}

	public static int getTotalWeight(ArrayList<Production> list) {
		int heft = 0;
		for (Production value : list) {
			heft += value.getWeight();
		}
		return heft;
	}
}
