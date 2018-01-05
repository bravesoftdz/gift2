package by.htp_gvozdev.gift.logic.operation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import by.htp_gvozdev.gift.bean.Production;
import by.htp_gvozdev.gift.logic.Gift;
import by.htp_gvozdev.gift.runner.MainApp;

public class PrintToFile {

	public static void printFile() {
		try {
			File file = new File("src/by/htp_gvozdev/gift/report/Report.txt");
			FileWriter fileWriter = new FileWriter(file);
			PrintWriter printWriter = new PrintWriter(fileWriter);

			
			printWriter.println("================================================================");
			printWriter.println("                THE REPOPRT ABOUT NEW YEAR'S GIFT               ");
			printWriter.println("================================================================");
			printWriter.println("                        HEW YEAR'S GIFT                         ");
			printWriter.println("----------------------------------------------------------------");
			printWriter.printf("%5s %15s %15s %8s %8s %8s \t \n", "| No" + "|", "NAME" + "|", "TYPE" + "|", "COST" + "|",	"WEIGHT" + "|", "CONTENT" + "|");
			printWriter.println("----------------------------------------------------------------");
			int i = 1;
			for (Production value : MainApp.list) {
				printWriter.printf("%4s %15s %15s %8s %8s %8s \t \n", "| " +  i + " |", value.getName() + "|", value.getType() + "|",	value.getCost() + "|", value.getWeight() + "|", value.getConsSuga() + "|");

				i++;
			}
			printWriter.println("----------------------------------------------------------------");
			double sum = Gift.getTotalCost(MainApp.list);
			int heft = Gift.getTotalWeight(MainApp.list);
			double sSuga = Gift.getTotalConSuga(MainApp.list);
			
			String newSum = String.format("%.2f", sum);

			printWriter.printf("%1s %35s %8s %8s %8s \t \n", "|", "TOTAL" + "|", newSum + "|", heft + "|",String.format("%.2f", sSuga) + "|");
			printWriter.println("----------------------------------------------------------------");
			
			fileWriter.flush();
			fileWriter.close();

			ClearConsole.ClearCons();
			System.out.println("*The print was a success.");
			Menu.viewMenu();
			printWriter.close();
		} catch (IOException e) {
			ClearConsole.ClearCons();
			e.printStackTrace();
			System.out.println("*The print failed.");
			Menu.viewMenu();
		}

	}
	
}
