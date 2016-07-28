/**
 * 
 */
package sdh.java.session7;

import java.util.Scanner;

/**
 * @author Sudhish
 * 
 */
public class Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int arraySize = Integer.parseInt(in.nextLine());
		String[] elements = new String[arraySize];
		System.out.println("Enter all the elements: ");
		for (int i = 0; i < elements.length; i++) {
			elements[i] = in.next();
		}
		try {

			System.out.println("Entered array is : ");
			for (int i = 0; i < elements.length; i++) {
				System.out.println(elements[i] + "\t");
			}
			System.out.println("Seventh element is : " + elements[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception is handled:::Array is out of Bounds : " + e);
		}

	}

}
