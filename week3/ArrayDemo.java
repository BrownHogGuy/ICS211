/**
 * Demo for strings
 *
 * @author Cody Shitagi
 * @since 1/23/24
 */

public class ArrayDemo {
	/*
	 * Main Method
	 * @param rgs not in used
	 */
	public static void main(String[] args) {
		String[] stoogesName = createStooges();

		System.out.println(stoogesName[0] + " in main before");
		displayArray(stoogesName);
		System.out.println(stoogesName[1] + " in main after");

		String[] sArray = {"hi","bye?"};
		int[] iArray = {1, 2, 3};

		System.out.println(sArray);
	}
	public static void displayArray(String[] anArray) {
		int lengthofName=0;
		int lenghtOfArray = anArray.length();
		for (int i = 0; i < lengthOfArray; i ++) {
			lenghtOfName = anArray.length();
			system.out.println(array[i]);
		}
		anArray[0] = "Shemp";
	}
	public static String[] createStooges() {
		String[] stooges = new string[3];
		stooges[0] = new String("Larry");
		stooges[1] = new String("Mark");
		stooges[2] = new String("Curly");
		return stooges;
	}
}
