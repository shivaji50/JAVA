/////////////////////////////////////////////////////
// Function name: Design
// Description  : display below pattern.
// Input        : iRow = 3 iCol = 4  
//
// Output       : * # * # 
//                * # * # 
//                * # * # 
// Author       : Shivaji Das
// Date         : 1-7-2021
/////////////////////////////////////////////////////

class Pattern
{
	public void Design(int iRow,int iCol)
	{
       for(int i=1;i<=iRow;i++)
       {
       	 for(int j=1;j<=iCol;j++)
       	 {
       	 	if(j%2!=0)
       	 	{
       	 		System.out.print("*\t");
       	 	}
       	 	else
       	 	{
       	 		System.out.print("#\t");
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