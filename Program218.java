///////////////////////////////////////////////////////////
// Function Name : Addition()
// Description   : Addition of matrix(using Package Concept + using the Super Keyword)
// Input         : Row      :2
//               : Colum    :2
//               : Elements :1 2 
//                           3 4 
// Output        : 10
// Author        : Shivaji Das
// Date          : 13 June 2021
//////////////////////////////////////////////////////////

import java.util.*;
import Marvellous.Matrix;

class Demo extends Matrix
{
	public Demo(int iRow, int iCol)
	{
		super(iRow,iCol);
	}
	int Addition()
	{
		int iSum = 0;
		for(int i = 0; i < Arr.length; i++)
		{
			for (int j = 0;j < Arr[i].length ;j++ )
			{
				iSum = iSum + Arr[i][j];	
			}
		}		
		return iSum;
	}
}
class Program218
{
	public static void main(String str[])	
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int row = sobj.nextInt();
		
		System.out.println("Enter number of columns");
		int col = sobj.nextInt();

		Demo dobj = new Demo(row,col);
		dobj.Accept();
		dobj.Display();
		int ret = dobj.Addition();
		System.out.println("Addition is : "+ret);
		System.gc();
	}
}


























