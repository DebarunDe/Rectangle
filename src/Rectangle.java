import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Side 1:"); //Display Prompt
		double Side1 = in.nextInt();
		in.nextLine();
		
		System.out.print("Side 2:"); //Display Prompt
		double Side2 = in.nextInt();
		in.nextLine();
		

		
		double Area = Side1*Side2;
	    System.out.printf("Area: %15.2f", Area);
	    System.out.println("");
		
		double Perimeter = 2*Side1 + 2*Side2;
		System.out.printf("Perimeter: %10.2f", Perimeter);
		System.out.println("");
		
		double Diagonal = Math.sqrt((Side1*Side1) + (Side2*Side2));
		System.out.printf("Diagonal Length: %.2f", Diagonal);

	}

}
