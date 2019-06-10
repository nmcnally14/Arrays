/**
 * 
 */
package arrays2D;

import java.util.Arrays;

/**
 * @author Nicola
 *
 */
public class EasierSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		System.out.println("Unsorted : "+Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("Sorted : "+Arrays.toString(array));

	}

}
