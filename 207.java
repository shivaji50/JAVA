/////////////////////////////////////////////////////
// Function name: AddDiagonal
// Description  : addition of diagonal elements 
// Input        : 3 2 5 9
//                4 3 2 2
//                8 4 1 5
//                3 9 7 5
// Output       : 12
// Author       : Shivaji Das
// Date         : 28-6-2021
/////////////////////////////////////////////////////
import java.util.*;

class Matrix
{
	public int AddDiagonal(int Arr[][],int iRow,int iCol)
	{
		int iSum=0;
		for(int i=0;i<Arr.length;i++) 
       {
      	for(int j=0;j<Arr[i].length;j++)
      	{
      		if(i==j)
      		{
      			iSum=iSum+Arr[i][j];
      		}
      	}
       }
      return iSum;
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
       int iRet=obj.AddDiagonal(Arr,Row,Col);
       System.out.println("The Addition of the Diagonal is "+iRet);
		
	}
}