import java.util.Scanner;

public class MyMainAssign1 {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter x1: ");
		int x1 = reader.nextInt(); 
		
		System.out.println("Enter y1: ");
		int y1 = reader.nextInt();
		
		System.out.println("Enter x2: ");
		int x2 = reader.nextInt(); 
		
		System.out.println("Enter y2: ");
		int y2 = reader.nextInt();

		reader.close(); 
		
		Point point = new Point(x1, y1, x2, y2);
		double distance = point.distance();
		System.out.println("Distance between two points :: " + distance);
	}

}
