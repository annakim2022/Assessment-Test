
public class Order {

	int orderNumber;
	Item[] orderList;
	double orderTotal;
	boolean orderDone;

	public Order(int oN, int N, double oT, boolean oD) {
		this.orderNumber = oN;
		this.orderTotal = oT;
		this.orderList = new Item[N];
		this.orderDone = false;

	}

	public Item[] addToOrder(int orderNumber, Item item, int orderSize) { // take item number and add it to an existing order

		for (int i = 0; i < orderSize; i++) {
			if (orderList[i] == null) {
				
				orderList[i] = item;
				
			}
			
		}
		
		return orderList;
	}

	public void printList(int orderNumber, int orderSize) { // use orderNumber to get list of items in that order
		for (int i = 0; i < orderSize; i++) {
		System.out.println(orderList[i]);
		}
	}

	public int getOrderTotal(Item[] order) { // return the total of all item prices in an order

		return 0;
	}

}
