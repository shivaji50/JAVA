/////////////////////////////////////////////////////
// Function name: AddColum
// Description  :  display addition of elements From each column. 
// Input        : 3 2 5 9
//                4 3 2 2
//                8 4 1 9
//                3 9 7 5
// Output       : 18 18 15 25 
// Author       : Shivaji Das
// Date         : 28-6-2021
/////////////////////////////////////////////////////
import java.util.*;

class Matrix
{
	public void AddColum(int Arr[][],int iRow,int iCol)
	{
		int iSum=0;
		System.out.println("The Addition of coloums is");
		for(int i=0;i<Arr.length;i++) 
       {
       	 iSum=0;
      	for(int j=0;j<Arr[i].length;j++)
      	{
      			iSum=iSum+Arr[i][j];
      	}
      	System.out.print(iSum+"\t");
       }
      
	}

}

class P4
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