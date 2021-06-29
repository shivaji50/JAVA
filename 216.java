/////////////////////////////////////////////////////
// Function name: Matrix
// Description  : check whether the matrix is Sparse matrix or not.
// Input        : 1 0 3 0
//                0 6 0 0
//                0 0 1 0
//                9 0 0 9
//
// Output       : True
// Author       : Shivaji Das
// Date         : 30-6-2021
/////////////////////////////////////////////////////
import java.util.*;

class Matrix
{
	public int Arr[][];
	public Matrix(int iRow, int iCol)
	{
		Arr = new int[iRow][iCol];
	}
	protected void finalize()
	{
		Arr = null;
	}
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Please enter th elements");
		for(int i = 0; i < Arr.length; i++)	
		{
			for(int j = 0; j < Arr[i].length; j++)	
			{
				Arr[i][j] = sobj.nextInt();
			}
		}
	}
	public void Display()
	{
		System.out.println("Elemenets of Matrix are : ");
		for(int i = 0; i < Arr.length; i++)	
		{
			for(int j = 0; j < Arr[i].length; j++)	
			{
				System.out.print(Arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

	public void frequency()
	{
		int icnt1 = 0;
		int icnt2 = 0;
		for(int i = 0; i < Arr.length; i++)	
		{
			for(int j = 0; j < Arr[i].length; j++)	
			{
				if(Arr[i][j]==0)
				{
					icnt1++;
				}
				else
				{
					icnt2++;
				}
				
			}
		}
		       if(icnt1>icnt2)
		        {
			        System.out.println("true");
		        }
		        else
		        {
			        System.out.println("false");
		        }
				
	}
}

class P5
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
		mobj.frequency();
		

		System.gc();
	}
}