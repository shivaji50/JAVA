/////////////////////////////////////////////////////
// Function name: Row
// Description  : display below pattern. 
// Input        : iRow = 4 iCol = 4 
// Output       : A B C D 
//                A B C D 
//                A B C D 
//                A B C D
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
       	  c='A';
       	  for(int j=1;j<=iCol;j++)
       	  {
       	  	System.out.print("\t"+c);
       	  	c++;
       	  }
       	  System.out.println();
       }
	}
}

class P1
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