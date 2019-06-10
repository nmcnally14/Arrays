/**
 * 
 */
package arrays2D;

import java.util.Arrays;

/**
 * @author Nicola
 *
 */
public class SortingArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] anArray = {4, 6, 3, 1};
		System.out.println("Unsorted : "+Arrays.toString(anArray));
		boolean flag = true;
		int temp;
		//now go through checking for potential swaps
		while (flag)	{
			flag = false;
			for (int loop = 0; loop < anArray.length-1; loop++)	{
				//compare values
				if (anArray[loop] > anArray[loop+1])	{
					//swap
					temp = anArray[loop];
					anArray[loop] = anArray[loop+1];
					anArray[loop+1] = temp;
					//swap so set flag to ensure another pass occurs
					flag = true;
				}
			}
		}
		System.out.println("Sorted : "+Arrays.toString(anArray));
	}

}
