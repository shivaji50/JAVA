///////////////////////////////////////////////////////////
// Function Name : MaximumRow()
// Description   : Maximum element of row no(using Package Concept + using the Super Keyword)
// Input         : Row      :2
//               : Colum    :2
//               : Elements :1 2 
//                           3 4 
// Output        : 2  4
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
	void MaximumRow()
	{
		int iMax = 0;
		for(int i = 0; i< Arr.length; i++)
		{
			iMax = Arr[i][0];
			for(int j = 0; j < Arr[i].length; j++)
			{
				if(Arr[i][j] > iMax)
				{
					iMax = Arr[i][j];
				}
			}
			System.out.println("Maximum element of row no "+ (i+1) +" is : "+iMax );
		}
	}
}
class Program221
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
		dobj.MaximumRow();
		System.gc();
	}
}


























