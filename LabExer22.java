import java.util.Scanner;
public class LabExer22 {
	private static String itemName;
	private static double itemPrice, amountDue;
	private static int itemQuantity;
	
	public void setItemName(String newItemName) {
		itemName = newItemName;
	}
	public void setTotalCost(int quantity, double price) {
		itemQuantity = quantity;
		itemPrice = price;
	}
	public String getItemName() {
		return itemName;
	}
	public static double getTotalCost() {
		amountDue = itemQuantity * itemPrice;
		return amountDue;
	}
	public static void readInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name of the item you are purchasing.");
		itemName = s.nextLine();
		System.out.println("Enter the quantity and price separated by space.");
		itemQuantity = s.nextInt();
		itemPrice = s.nextDouble();
	}
	public static void writeOutput() {
		System.out.println("You are purchasing " + itemQuantity + " " + itemName + "(s) at " + itemPrice + " each.");
	}
	public static void main(String[] args) {
		//LabExer2 s = new LabExer2();
		readInput();
		writeOutput();
		System.out.printf("Amount due is %.2f", getTotalCost());
	}
}
