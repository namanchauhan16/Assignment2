package App;

import java.util.ArrayList;
import java.util.Scanner;

public class EspressoMenu {
	Scanner sc = new Scanner(System.in);
	ArrayList<String> order = new ArrayList<String>();
	int opt2, total2, a;

	public void getEspressoMenu() {

		do {
			System.out.println("--------------Espresso Menu--------------\n" + "1 for Espresso add-on Milk    Rs.60\n"
					+ "2 for Espresso add-on Cream    Rs.75\n" + "3 for Espresso add-on Latte    Rs.100\n"
					+ "4 to got to main menu\n" + "-----------------------------------------");
			System.out.println();
			System.out.println("**Choose your option:- ");
			opt2 = sc.nextInt();
			switch (opt2) {
			case 1:
				order.add("Espresso add-on Milk    Rs.60");
				total2 += 60;
				break;
			case 2:
				order.add("Espresso add-on Cream    Rs.75");
				total2 += 75;
				break;
			case 3:
				order.add("Espresso add-on Latte    Rs.100");
				total2 += 100;
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
