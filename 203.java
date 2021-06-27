/////////////////////////////////////////////////////
// Function name: Row
// Description  : display below pattern. 
// Input        : iRow = 4 iCol = 4 
// Output       : A B C D 
//                a b c d 
//                A B C D 
//                a b c d
// Author       : Shivaji Das
// Date         : 27-6-2021
/////////////////////////////////////////////////////
import java.util.*;

class Pattern
{
	public void Row(int iRow,int iCol)
	{
       char C='A',c='a';

       for(int i=1;i<=iRow;i++)
       {
       	  C='A';
       	  c='a';
       	  for(int j=1;j<=iCol;j++)
       	  {
       	  	if(i%2!=0)
       	  	{
       	  		System.out.print("\t"+C);
       	  	}
       	  	else
       	  	{
       	  		System.out.print("\t"+c);
       	  	}
       	  	C++;
       	  	c++;
       	  	
       	  }
       	  System.out.println();
       }
	}
}

class P2
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