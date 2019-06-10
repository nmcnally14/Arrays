/**
 * 
 */
package arrays2D;

/**
 * @author Nicola
 *
 */
public class TableArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//create the 2d array
		int [][] a2DArray = new int [3][4];
		
		//populate using nested loop
		for (int rowCounter = 0; rowCounter < 3; rowCounter++)	{
			for (int colCount = 0; colCount < 4; colCount ++)	{
				a2DArray[rowCounter][colCount] = 999;
			}
		}
		
		int number = 1;
		
		for (int rowCounter = 0; rowCounter < a2DArray.length; rowCounter++)	{
			for (int colCount = 0; colCount < a2DArray[rowCounter].length; colCount ++)	{
				a2DArray[rowCounter][colCount] = number;
				number *= 2;
	
			}
		}
		
		//output
		for (int rowCounter = 0; rowCounter < a2DArray.length; rowCounter++)	{
			
			//loop
			for (int colCount = 0; colCount < a2DArray[rowCounter].length; colCount++)	{
				System.out.printf("[%d %d] : %d ", rowCounter, colCount, a2DArray[rowCounter][colCount]);
			}
			System.out.println("\n");
		}
	}
}

