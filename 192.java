/////////////////////////////////////////////////////
// Function name: Check
// Description  : check whether NO is present or not.
// Input        : N : 6
//              : NO: 66
//              : Elements : 85 66 3 66 93 88
// Output       : FALSE
// Author       : Shivaji Das
// Date         : 1-6-2021
/////////////////////////////////////////////////////

import java.util.*;

class Number
{
	public int Check(int Arr[],int iNo)
	{
		int iCnt=0;
        for(int i=0;i<Arr.length;i++)
        {
        	if(Arr[i]==iNo)
        	{
        		iCnt++;
        		break;
        	}
        }
        return iCnt;
	}
}

class P1
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

		System.out.println("Enter the the Element to Search");
		int iNo=Sobj.nextInt();

		Number obj=new Number();
		int iRet=0;
		iRet=obj.Check(Arr,iNo);
		if(iRet==1)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
		
	}
}