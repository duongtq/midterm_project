
public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order anOrder = new Order();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);		
		// add the dvd to the order
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);		
		// add the dvd to the order
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);		
		// add the dvd to the order
		anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());
		// Test code for remove function
		// anOrder.removeDigitalVideoDisc(dvd2);
		anOrder.printAllMovie();
		
		// test driver
		Order myOrder = new Order();
		DigitalVideoDisc[] discArray = {dvd1, dvd1, dvd1, dvd1, dvd1, dvd1, dvd1, dvd1, dvd1, dvd1};
		myOrder.addDigitalVideoDisc(discArray);
		
		Order myOrder1 = new Order();
		
		myOrder1.addDigitalVideoDisc(dvd1, dvd2);
		myOrder1.addDigitalVideoDisc(dvd2, dvd3);
		myOrder1.addDigitalVideoDisc(dvd1, dvd2);
		myOrder1.addDigitalVideoDisc(dvd1, dvd2);
		myOrder1.addDigitalVideoDisc(dvd1, dvd2);
		
		myOrder1.addDigitalVideoDisc(dvd1, dvd2);
		
		
		Order myOrder2 = new Order();
		// Test method getDateOrder
		
		System.out.println("Date created: " + myOrder2.getDateOrdered());
		
		
		Order myOrder3 = new Order();
		System.out.println("Date created: " + myOrder3.getDateOrdered());
		
		// Max ordered reached here. The warning will be printed.
		Order myOrder4 = new Order();
		System.out.println("Date created: " + myOrder4.getDateOrdered());
		
		System.out.println("\nAll items: ");
		anOrder.printWithFormat();
		
	}
	
}
