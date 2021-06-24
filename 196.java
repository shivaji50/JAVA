/////////////////////////////////////////////////////
// Function name: Product
// Description  : returnproduct of all odd elements.
// Input        : N : 6
//              : Elements : 15 66 3 70 10 88
// Output       : 45
// Author       : Shivaji Das
// Date         : 1-6-2021
/////////////////////////////////////////////////////

import java.util.*;

class Number
{
	public int Product(int Arr[])
	{
		int iMult=1;
        for(int i=0;i<Arr.length;i++)
        {
        	
        	if(Arr[i]%2!=0)
        	{
        		iMult=iMult*Arr[i];
        	}
        }
        return iMult;
	}
}

class P5
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


		Number obj=new Number();
		int iRet=obj.Product(Arr);
		System.out.println("The Product of old elements is : "+iRet);
		
		
	}
}