package App;

import java.util.ArrayList;
import java.util.Scanner;

public class CappuccinoMenu {
	Scanner sc = new Scanner(System.in);
	ArrayList<String> order = new ArrayList<String>();
	int opt3, total3, a;

	public void getCappuccinoMenu() {

		do {
			System.out
					.println("--------------Cappuccino Menu--------------\n" + "1 for Cappuccino add-on Milk    Rs.80\n"
							+ "2 for Cappuccino add-on Cream    Rs.90\n" + "3 for Cappuccino add-on Latte    Rs.125\n"
							+ "4 to got to main menu\n" + "-------------------------------------------");
			System.out.println();
			System.out.println("**Choose your option:- ");
			opt3 = sc.nextInt();
			switch (opt3) {
			case 1:
				order.add("Cappuccino add-on Milk    Rs.80");
				total3 += 80;
				break;
			case 2:
				order.add("Cappuccino add-on Cream    Rs.90");
				total3 += 90;
				break;
			case 3:
				order.add("Cappuccino add-on Latte    Rs.125");
				total3 += 125;
				break;
			case 4:
				a = 4;
				break;
			default:
				System.out.println("----Please select a valid option----\n");
				break;
			}
		} while (a != 4);
	}
}
