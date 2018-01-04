package by.htp_gvozdev.gift.runner;

import java.util.ArrayList;

/*
 Новогодний подарок. 
 1. Определить иерархию конфет и прочих сладостей.
 2. Создать несколько объектов-конфет. 
 3. Собрать детский подарок с определением его веса. 
 4. Провести сортировку конфет в подарке на основе одного из параметров. 
 5. Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.
 */

import by.htp_gvozdev.gift.bean.Chocolate;
import by.htp_gvozdev.gift.bean.Cookies;
import by.htp_gvozdev.gift.bean.Marshmallow;
import by.htp_gvozdev.gift.bean.Production;
import by.htp_gvozdev.gift.logic.Gift;

public class MainApp {

	public static ArrayList<Production> list = new ArrayList<Production>();

	public static void main(String[] args) {
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
