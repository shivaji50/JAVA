/////////////////////////////////////////////////////
// Function name: Row
// Description  : display below pattern. 
// Input        : iRow = 3 iCol = 5
// Output       : 1 2 3 4 
//                5 6 7 8 
//                9 10 11 12
// Author       : Shivaji Das
// Date         : 27-6-2021
/////////////////////////////////////////////////////
import java.util.*;

class Pattern
{
	public void Row(int iRow,int iCol)
	{
       int c=1;

       for(int i=1;i<=iRow;i++)
       {
       	  
       	  for(int j=1;j<=iCol;j++)
       	  {
       	  	System.out.print("\t"+c);
       	  	c++;
       	  }
       	  System.out.println();
       }

	}
}

class P5
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