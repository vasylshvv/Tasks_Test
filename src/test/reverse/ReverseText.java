package test.reverse;

/**
 * @author Vasyl Shypivdych
 * */
import java.util.Scanner;

public class ReverseText {
	private static Scanner in;

	public static void main(String[] args) {

		// input text for reverse
		in = new Scanner(System.in);
		System.out.print("Please enter text: ");
		String input = in.nextLine();    		
		String output = reverse(input);
		System.out.println("Reverse text is: "+output);
		
	}
	
	public static String reverse(String input){	
		String textReverse = "";	
		// changed text 
		for (int i = input.length()-1; i >= 0; i--) {
			char step = input.charAt(i);
			textReverse = textReverse + step;
		}		
		return textReverse;
	}
}
