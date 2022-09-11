package App;

import java.util.Scanner;

public class mainMenu {
	EspressoMenu espMenu = new EspressoMenu();
	CappuccinoMenu capMenu = new CappuccinoMenu();
	LatteMenu latMenu = new LatteMenu();
	Scanner sc = new Scanner(System.in);
	int opt1, billTotal;

	public void getMenu() {
		do {
			System.out.println(
					"----------MENU----------\nPress 1 for Espresso\n" + "Press 2 for Cappuccino\nPress 3 for Latte\n"
							+ "Press 4 to Generate bill and exit\n" + "------------------------");
			System.out.println();
			System.out.print("**Choose your option:- ");
			opt1 = sc.nextInt();
			System.out.println();
			switch (opt1) {
			case 1:
				espMenu.getEspressoMenu();
				break;
			case 2:
				capMenu.getCappuccinoMenu();
				break;
			case 3:
				latMenu.getLatteMenu();
				break;
			case 4:
				System.out.println("------------Your Bill------------");
				System.out.println();
				System.out.println("Items ordered");
				System.out.println();
				for (int i = 0; i < espMenu.order.size(); i++) {
					System.out.println(espMenu.order.get(i));
				}
				for (int i = 0; i < capMenu.order.size(); i++) {
					System.out.println(capMenu.order.get(i));
				}
				for (int i = 0; i < latMenu.order.size(); i++) {
					System.out.println(latMenu.order.get(i));
				}
				System.out.println();
				billTotal = espMenu.total2 + capMenu.total3 + latMenu.total4;
				System.out.println("Total amount to pay:- " + billTotal);
				System.out.println("---------------------------------");
				break;
			default:
				System.out.println("----Please select a valid option----\n");
				break;
			}
		} while (opt1 != 4);
	}
}
