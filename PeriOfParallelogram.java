import java.util.Scanner;
public class PeriOfParallelogram {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		double height,breadth,perimeter;
		System.out.print("Enter the height of the parallelogram: ");
		height= in.nextDouble();
		System.out.print("Enter the breadth of the parallelogram: ");
		breadth=in.nextDouble();
		perimeter=2*(height+breadth);
		System.out.print("The perimeter of the parallelogram is "+perimeter);
			
		}
		
	}	