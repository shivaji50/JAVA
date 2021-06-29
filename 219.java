/////////////////////////////////////////////////////
// Function name: Design
// Description  : display below pattern.
// Input        : iRow = 3 iCol = 5 
//
// Output       : 5 4 3 2 1 
//                5 4 3 2 1 
//                5 4 3 2 1 
// Author       : Shivaji Das
// Date         : 30-6-2021
/////////////////////////////////////////////////////
import java.util.*;

class Pattern
{
	public void Design(int iRow,int iCol)
	{
       for(int i=1;i<=iRow;i++)
       {
       	 for(int j=iCol;j>0;j--)
       	 {
       	 	System.out.print(j+"\t");
       	 }
       	 System.out.println();
       }
	}
}

class P3
{
	public static void main(String args[]) 
	{
		Scanner Sobj=new Scanner(System.in);

		System.out.println("Enter the Row");
		int row=Sobj.nextInt();
		System.out.println("Enter the Colum");
		int col=Sobj.nextInt();

		Pattern obj=new Pattern();
		obj.Design(row,col);
		
	}
}