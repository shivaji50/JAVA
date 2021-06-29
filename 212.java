/////////////////////////////////////////////////////
// Function name: AddColum
// Description  :  display transpose of the matrix.
// Input        : 3 2 5 9
//                4 3 2 2
//                8 4 1 5
//                3 9 7 5
//
// Output       : 3 4 8 3
//                2 3 4 9
//                5 2 1 7
//                9 2 5 5
// Author       : Shivaji Das
// Date         : 29-6-2021
/////////////////////////////////////////////////////
import java.util.*;

class Matrix
{
	public void AddColum(int Arr[][],int iRow,int iCol)
	{
		int Brr[][]=new int[iRow][iCol];
		int jj=0,ii=0;

		for(int i=0;i<Brr.length;i++) 
       {
       	 
      	for(int j=0;j<Brr[i].length;j++)
      	{
      		jj=i;
      		ii=j;
      		Brr[ii][jj]=Arr[i][j];
      	}
      	
      }

     System.out.println("After Transporx");
      for(int i=0;i<Brr.length;i++) 
       {
      	for(int j=0;j<Brr[i].length;j++)
      	{
      		System.out.print(Brr[i][j]+"\t");
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
		System.out.println("Enter The Row");
		int Row=Sobj.nextInt();
		System.out.println("Enter The Colum");
		int Col=Sobj.nextInt();

		int Arr[][]=new int[Row][Col];
     
        System.out.println("Enter The Elements");
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
               Arr[i][j]=Sobj.nextInt();
			}
		}

       System.out.println("Entered elements");
       for(int i=0;i<Arr.length;i++) 
       {
      	for(int j=0;j<Arr[i].length;j++)
      	{
      		System.out.print(Arr[i][j]+"\t");
      	}
      	System.out.println();
       }
       
       Matrix obj=new Matrix();
       obj.AddColum(Arr,Row,Col);
       
		
	}
}