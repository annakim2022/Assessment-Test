import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Hello! If you would like to order, enter 1. If you would like to pay, enter 2.");

		while (!scan.hasNextInt()) {
			scan.next();
			System.out.println("Invalid input. Please enter 1 to order, or 2 to pay.");
		}

		int input1 = scan.nextInt();

		while (input1 != 1 && input1 != 2) {
			System.out.println("Invalid input. Please enter 1 to order, or 2 to pay.");
		}

		if (input1 == 1) {
			System.out.println("Enter 1 to start a new order, or 2 to add to an existing order.");

			while (!scan.hasNextInt()) {
				scan.next();
				System.out.println("Invalid input. Please enter 1 to start, or 2 to add.");
			}

			int input2 = scan.nextInt();

			while (input2 != 1 && input2 != 2) {
				System.out.println("Invalid input. Please enter 1 to start, or 2 to add.");
			}
			if (input2 == 1) {
				int orderNumber = 1;
				int orderSize = 1;
				int holder = 1;
				System.out.println(
						"Your order number is ____. Your robot number is ____. What would you like to order? Please enter item number.");
				Order order = new Order(orderNumber, orderSize, holder, false);

				int input_iN = scan.nextInt();

				while (input_iN > 0 && input_iN < 6) {

					if (input_iN == 1) {
						Item item = new Item("Soda", input_iN, 1.99);

						//order.addToOrder(orderNumber, item, orderSize);
						//order.printList(orderNumber, orderSize);

						System.out.println("You ordered a " + item.getItemName() + " which is $ "
								+ item.getItemPrice(input_iN) + ". ");

					} else if (input_iN == 2) {
						Item item = new Item("Hot Dog", input_iN, 4.99);

						//order.addToOrder(orderNumber, item, orderSize);
						//order.printList(orderNumber, orderSize);

						System.out.println("You ordered a " + item.getItemName() + " which is $ "
								+ item.getItemPrice(input_iN) + ". ");

					} else if (input_iN == 3) {
						Item item = new Item("Pizza", input_iN, 8.99);

						//order.addToOrder(orderNumber, item, orderSize);
						//order.printList(orderNumber, orderSize);
						System.out.println("You ordered a " + item.getItemName() + " which is $ "
								+ item.getItemPrice(input_iN) + ". ");

					} else if (input_iN == 4) {
						Item item = new Item("Pasta", input_iN, 13.99);

						//order.addToOrder(orderNumber, item, orderSize);
						//order.printList(orderNumber, orderSize);
						System.out.println("You ordered a " + item.getItemName() + " which is $ "
								+ item.getItemPrice(input_iN) + ". ");

					} else if (input_iN == 5) {
						Item item = new Item("Family Meal", input_iN, 21.99);

						//order.addToOrder(orderNumber, item, orderSize);
						//order.printList(orderNumber, orderSize);
						System.out.println("You ordered a " + item.getItemName() + " which is $ "
								+ item.getItemPrice(input_iN) + ". ");

					}
					System.out.print(
							"Do you want to add another item? Please enter another item number to add to order, or enter 0 to place order.");
					input_iN = scan.nextInt();
					if (input_iN != 0) {

						orderSize++;
					}
					while (input_iN > 5) {
						System.out.println("Invalid input. Please enter a number between 0 and 5.");
						input_iN = scan.nextInt();
					}

				}

				System.out.print("Your order has been placed, please wait for the robot to bring it to you.");

				//orderNumber++;
				// when user enters 0, add all items to orderNumber and chefTODO
			}
			// else if (input2 == 2) {
			// System.out.println("add to existing");
			// }

		}
		/*
		 * else if (input1 == 2) { System.out.println("What is your order number?");
		 * 
		 * while(!scan.hasNextInt()) { scan.next();
		 * System.out.println("Invalid input. Please enter your order number.");
		 * 
		 * } int input_oN = scan.nextInt();
		 * 
		 * //getOrder(input_oN);
		 * 
		 * System.out.println(input_oN);
		 * 
		 * }
		 */

		scan.close();
	}
}
