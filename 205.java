/////////////////////////////////////////////////////
// Function name: Row
// Description  : display below pattern. 
// Input        : iRow = 4 iCol = 5 
// Output       : 4 4 4 4 4 
//                3 3 3 3 3
//                2 2 2 2 2 
//                1 1 1 1 1
// Author       : Shivaji Das
// Date         : 27-6-2021
/////////////////////////////////////////////////////
import java.util.*;

class Pattern
{
	public void Row(int iRow,int iCol)
	{
       int c=iRow;

       for(int i=1;i<=iRow;i++)
       {
       	  
       	  for(int j=1;j<=iCol;j++)
       	  {
       	  	System.out.print("\t"+c);
       	  }
       	  System.out.println();
       	  c--;
       }

	}
}

class P4
{
	public static void main(String[] args) 
	{
		Scanner Sobj=new Scanner(System.in);
		System.out.println("Enter the Row");
		int Row=Sobj.nextInt();
		System.out.println("Enter the Colum");
		int Col=Sobj.nextInt();

		Pattern obj=new Pattern();
		obj.Row(Row,Col);

	}
}