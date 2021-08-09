import java.util.Scanner;
public class VowelCons {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the alphabet: ");
		char alphabet=in.next().trim().charAt(0);
		if(alphabet=='a'|| alphabet=='e' || alphabet=='i' || alphabet=='o'||alphabet=='u'||alphabet=='A'||alphabet=='E'||alphabet=='I'||alphabet=='O'||alphabet=='U')
			System.out.printf("%c is a vowel",alphabet);
		else
			System.out.printf("%c is a consonant",alphabet);
		
	}	
}