/////////////////////////////////////////////////////
// Function name: Display
// Description  : accept Range, Display all elements from that range
// Input        : N : 6
//              : Start: 60
//              : End : 90
//              : Elements : 85 66 3 66 93 88
// Output       : 85 66 76 88
// Author       : Shivaji Das
// Date         : 1-6-2021
/////////////////////////////////////////////////////

import java.util.*;

class Number
{
	public void Display(int Arr[],int iNos,int iNoe)
	{
		
        for(int i=0;i<Arr.length;i++)
        {
        	if((Arr[i]>iNos)&&(Arr[i]<iNoe))
        	{
        		System.out.print("\t"+Arr[i]);
        	}
        }
       
	}
}

class P4
{
	public static void main(String[] args) 
	{
		Scanner Sobj=new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int iSize=Sobj.nextInt();

		int Arr[]=new int[iSize];
		System.out.println("Enter the Elements");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=Sobj.nextInt();
		}

		System.out.println("Enter the Start point");
		int iNos=Sobj.nextInt();
		System.out.println("Enter the End point");
		int iNoe=Sobj.nextInt();

		Number obj=new Number();
		obj.Display(Arr,iNos,iNoe);
		
		
	}
}