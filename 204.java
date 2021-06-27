/////////////////////////////////////////////////////
// Function name: Row
// Description  : display below pattern. 
// Input        : iRow = 3 iCol = 5
// Output       : A A A A A
//                B B B B B 
//                C C C C C
// Author       : Shivaji Das
// Date         : 27-6-2021
/////////////////////////////////////////////////////
import java.util.*;

class Pattern
{
	public void Row(int iRow,int iCol)
	{
       char c='A';

       for(int i=1;i<=iRow;i++)
       {
       	  
       	  for(int j=1;j<=iCol;j++)
       	  {
       	  	System.out.print("\t"+c);
       	  	
       	  }
       	  System.out.println();
          c++;
       }

	}
}

class P3
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