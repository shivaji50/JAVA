/////////////////////////////////////////////////////
// Function name: Design
// Description  : display below pattern.
// Input        : iRow = 3 iCol = 4  
//
// Output       : 1 1 1 1 
//                2 2 2 2 
//                3 3 3 3 
//                4 4 4 4 
// Author       : Shivaji Das
// Date         : 1-7-2021
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
       	 	System.out.print(i+"\t");
       	 }
       	 System.out.println();
       }
	}
}

class P5
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