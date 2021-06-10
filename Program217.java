///////////////////////////////////////////////////////////
// Function Name : main()
// Description   : Accept and Display normal matrix(using Package Concept)
// Input         : Row      :2
//               : Colum    :2
//               : Elements :1 2 3 4 
// Output        : 1   2
//               : 3   4
// Author        : Shivaji Das
// Date          : 10 June 2021
//////////////////////////////////////////////////////////

import java.util.*;
import Marvellous.Matrix;

class Program217
{
	public static void main(String str[])	
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int row = sobj.nextInt();
		
		System.out.println("Enter number of columns");
		int col = sobj.nextInt();

		Matrix mobj = new Matrix(row,col);
		mobj.Accept();
		mobj.Display();
		
		System.gc();
	}
}


























