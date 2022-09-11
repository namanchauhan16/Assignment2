package App;

import java.util.ArrayList;
import java.util.Scanner;

public class LatteMenu {
	Scanner sc = new Scanner(System.in);
	ArrayList<String> order = new ArrayList<String>();
	int opt4, total4, a;

	public void getLatteMenu() {

		do {
			System.out.println("--------------Latte Menu--------------\n" + "1 for Latte add-on Milk    Rs.100\n"
					+ "2 for Latte add-on Cream    Rs.125\n" + "3 for Latte add-on Latte    Rs.150\n"
					+ "4 to got to main menu\n" + "--------------------------------------");
			System.out.println();
			System.out.println("**Choose your option:- ");
			opt4 = sc.nextInt();
			switch (opt4) {
			case 1:
				order.add("Latte add-on Milk    Rs.100");
				total4 += 100;
				break;
			case 2:
				order.add("Latte add-on Cream    Rs.125");
				total4 += 125;
				break;
			case 3:
				order.add("Latte add-on Latte    Rs.150");
				total4 += 150;
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
