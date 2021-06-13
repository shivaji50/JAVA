///////////////////////////////////////////////////////////
// 1 Function
// Function Name : Maximum()
// Description   : Maximum of matrix(using Package Concept + using the Super Keyword)
// Input         : Row      :2
//               : Colum    :2
//               : Elements :1 2
//                           3 4 
// Output        : 4
// Author        : Shivaji Das
// Date          : 13 June 2021
//////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////
// 2 Function
// Function Name : Minimum()
// Description   : Minimum of matrix(using Package Concept + using the Super Keyword)
// Input         : Row      :2
//               : Colum    :2
//               : Elements :1 2 
//                           3 4 
// Output        : 1
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
	int Maximum()
	{
		int iMax = Arr[0][0];
		for(int i = 0; i< Arr.length; i++)
		{
			for(int j = 0; j < Arr[i].length; j++)
			{
				if(Arr[i][j] > iMax)
				{
					iMax = Arr[i][j];
				}
			}
		}
		return iMax;
	}
	int Minimum()
	{
		int iMin = Arr[0][0];
		for(int i = 0; i< Arr.length; i++)
		{
			for(int j = 0; j < Arr[i].length; j++)
			{
				if(Arr[i][j] < iMin)
				{
					iMin = Arr[i][j];
				}
			}
		}
		return iMin;
	}
}
class Program220
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
		int ret = dobj.Maximum();
		System.out.println("Maximum is : "+ret);
		ret = dobj.Minimum();
		System.out.println("Minimum is : "+ret);
		System.gc();
	}
}


























