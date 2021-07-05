/////////////////////////////////////////////////////
// Function name: Design
// Description  : display below pattern.
// Input        : iRow = 5 iCol = 5   
//
// Output       :1 2 3 4 5 
//               1 2     5  
//               1   3   5
//               1     4 5 
//               1 2 3 4 5
// Author       : Shivaji Das
// Date         : 5-7-2021
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
       	 	if(((j==i)||(i==1)||(i==iRow)||(j==1)||(j==iCol)))
       	 	{
       	 		System.out.print(j+"\t");
       	 	}
       	 	else
       	 	{
       	 		System.out.print(" \t");
       	 	}
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