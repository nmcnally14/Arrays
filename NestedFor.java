/**
 * 
 */
package arrays2D;

/**
 * @author Nicola
 *
 */
public class NestedFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//print 3 rows of stars
		//outerloop
		for (int outer = 1; outer <= 3; outer++)	{
			//inner loop
			for (int inner = 1; inner <=5; inner++)	{
				System.out.println("*");
			}
			System.out.println();
		}
		
	}

}
