import java.util.Scanner;
public class PeriOfSquare {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		double side;
		System.out.print("Enter side of the square: ");
		side=in.nextDouble();
		System.out.print("The perimeter of the square is: "+(4*side));
		
	}	
}