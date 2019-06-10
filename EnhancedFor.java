/**
 * 
 */
package arrays2D;

/**
 * @author Nicola
 *
 */
public class EnhancedFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//create the array with values
		int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		int total = 0;
		
		//this could be replaced with the enhanced for below
		for (int counter = 0; counter < array.length; counter++)	{
			total += array[counter];
		}
		
		//enhanced FOR - add each elements value to total
		for (int number : array)	{
			total += number;
		}

		System.out.println(total);
	}

}
