/////////////////////////////////////////////////////
// Function name: Design
// Description  : display below pattern.
// Input        : iRow = 6 iCol = 6   
//
// Output       :* * * * * * 
//               * # # # * * 
//               * # # * $ * 
//               * # * $ $ * 
//               * * $ $ $ * 
//               * * * * * *
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
       	 for(int j=iCol;j>0;j--)
       	 {
       	 	if((j==i)||(i==1)||(i==iRow)||(j==1)||(j==iCol))
       	 	{
       	 		System.out.print("*\t");
       	 	}
       	 	else if(j>i)
       	 	{
       	 		System.out.print("#\t");
       	 	}
       	 	else
       	 	{
       	 		System.out.print("$\t");
       	 	}
       	 }
       	 System.out.println();
       }
	}
}

class P4
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