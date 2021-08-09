import java.util.Scanner;
public class PeriOfRectangle {

	public static void main(String[] args){
		double length,breadth,perimeter;
		Scanner in= new Scanner(System.in);
		System.out.print("Enter the length of the rectangle: ");
		length=in.nextDouble();
		System.out.print("Enter the breadth of the rectangle: ");
		breadth=in.nextDouble();
		perimeter=2*(length+breadth);
		System.out.print("The perimeter of the rectangle is "+perimeter);
		
	}	
}