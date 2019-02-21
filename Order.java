
public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	int n=0;
	private int qtyOrdered;
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (n<MAX_NUMBERS_ORDERED) {
			itemsOrdered[n] = disc;
			n = n + 1;
			System.out.println("Disc added successfully.");
		}
		if (n == MAX_NUMBERS_ORDERED) System.out.println("The order is almost full.");
	}
	
	void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i=0; i<n; i++) if (disc==itemsOrdered[i]) {
			itemsOrdered[i] = itemsOrdered[n-1];
			n = n-1;
			System.out.println("Disc removed successfully.");
		}
		if (n==0) System.out.println("The order is empty.");
	}
	float totalCost() {
		float sum = 0;
		float temp = 0;
		for (int i=0; i<n; i++) {
			temp = itemsOrdered[i].getCost();
			sum = sum + temp;
		}
		return sum;
	}
	void printAll() {
		for (int i=0; i<n; i++) {
			String temp = itemsOrdered[i].getTitle();
			System.out.println("The dvds in the order are:");
			System.out.println("itemsOrdered["+ i +"]" + " = " + temp);
		}
	}
}
