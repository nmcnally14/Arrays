/**
 * 
 */
package arrays2D;

/**
 * @author Nicola
 *
 */
public class AnotherNestedFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//prints the name incrementally
		String name = "Nicola Mc Nally";
		
		//outerloop runs a number of times dependent on the number of
		//chars in the name
		for (int outer = 0; outer < name.length(); outer++)	{
			//inner loop
			for (int inner = 0; inner <= outer; inner++)	{
				System.out.println(name.charAt(inner));
			}
			System.out.println();
		}

	}

}
