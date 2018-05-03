package test.add.numbers;

/**
 * @author Vasyl Shypivdych
 * */
import java.util.Scanner;

public class AddTwoNumbers {
	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		System.out.print("Please enter first number: ");
		int a  = in.nextInt();
		
		in = new Scanner(System.in);
		System.out.print("Please enter second number: ");
		int b = in.nextInt();
		
		int  sum = add(a, b);
		System.out.println("Result sum is: "+sum);

	}

	// method which add two numbers
	public static int add(int a, int b) {
		if (b == 0)
			return a;
		int sum = a ^ b; // add without carry
		int carry = (a & b) << 1; // carry-over
		return add(sum, carry); // recursion
	}

	

}
