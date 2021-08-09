import java.util.Scanner;
public class Fibonacci {
	static int fib(int n){
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n;
		System.out.print("Enter the limit for the series: ");
		n=in.nextInt();
		System.out.printf("The fibonacci series upto %d terms is: ",n);
		for(int i=0;i<n;i++){
			System.out.print(fib(i)+" ");
		}

	}	
}