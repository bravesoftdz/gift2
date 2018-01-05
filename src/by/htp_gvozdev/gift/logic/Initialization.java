package by.htp_gvozdev.gift.logic;

import java.util.ArrayList;

import by.htp_gvozdev.gift.bean.Chocolate;
import by.htp_gvozdev.gift.bean.Cookies;
import by.htp_gvozdev.gift.bean.Marshmallow;
import by.htp_gvozdev.gift.bean.Production;

public class Initialization {
	
	public static ArrayList<Production> list = new ArrayList<Production>();

	public static void getInitialization() {
		Gift.getGift();
	}
	
	public static ArrayList<Production> setGift() {

		list.add(new Chocolate("Mars", "Chocolate", 0.99, 50, 29.58)); // 0
		list.add(new Chocolate("Snickers", "Chocolate", 1.55, 95, 44.32)); // 1
		list.add(new Cookies("Mulinelli", "Cookies", 1.95, 300, 201.21)); // 2
		list.add(new Cookies("Bonomi", "Cookies", 7.99, 500, 71.12)); // 3
		list.add(new Marshmallow("Zefirelle", "Marshmallow", 1.95, 230, 30.59)); // 4

		return list;
	}
	
}
