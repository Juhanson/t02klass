import java.util.Scanner;

public class Fill{
	
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("Define the parameters of your cylindrical container.");
			
			System.out.print("Define radius: ");
			int r = scan.nextInt();
			
			System.out.print("Define height: ");
			int h = scan.nextInt();
			
			System.out.print("Litres of fluid in container: ");
			int fl = scan.nextInt();
			
		Container test1 = new Container(r, h, fl);
		System.out.format("The volume of your defined container is %.2f cm3.", test1.volume());
		System.out.format("%nYou try to force %.2f litres of fluid into it.%n", test1.fl);
		System.out.format("The container is now %.2f percent full.%n", test1.fluidPercent());
	}
}