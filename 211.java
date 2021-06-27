/////////////////////////////////////////////////////
// Function name: AddColum
// Description  :  display addition of elements From each column. 
// Input        : 3 2 5 9
//                4 3 2 2
//                8 4 1 9
//                3 9 7 5
//
// Output       : 4 3 2 2
//                3 2 5 9
//                3 9 7 5
//                8 4 1 9
// Author       : Shivaji Das
// Date         : 28-6-2021
/////////////////////////////////////////////////////
import java.util.*;

class Matrix
{
	public void AddColum(int Arr[][],int iRow,int iCol)
	{
		int Brr[][]=new int[iRow][iCol];

		for(int i=0;i<Brr.length;i++) 
       {
       	 
      	for(int j=0;j<Brr[i].length;j++)
      	{
      		if(i%2!=0)
      		{
      			Brr[i][j]=Arr[i-1][j];
      		}
      		else
      		{
      			Brr[i][j]=Arr[i+1][j];
      		}	
      	}
      	
      }

     System.out.println("After Swaping");
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

class P5
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