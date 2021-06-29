/////////////////////////////////////////////////////
// Function name: Design
// Description  :  display below pattern.
// Input        : iRow = 4 iCol = 3 
//
// Output       : * * * 
//                * * * 
//                * * * 
//                * * *
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
       	 for(int j=1;j<=iCol;j++)
       	 {
       	 	System.out.print("*\t");
       	 }
       	 System.out.println();
       }
	}
}

class P1
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