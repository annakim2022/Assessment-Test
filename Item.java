
public class Item {
	
	String itemName;
	int itemNumber;
	double itemPrice;
	
	
	public Item (String na, int num, double pr) {
		this.itemName = na;
		this.itemNumber = num;
		this.itemPrice = pr;
		
	}
	
	public String getItemName() {
		
		return this.itemName;
	}
	
	public double getItemPrice(int itemNumber) {
		if (itemNumber == 1) {
			return 1.99;
		}
		else if (itemNumber == 2) {
			return 4.99;
		}
		else if (itemNumber == 3) {
			return 8.99;
		}
		else if (itemNumber == 4) {
			return 13.99;
		}
		else if (itemNumber == 5) {
			return 21.99;
		}
		return 0;
	}
	

}
