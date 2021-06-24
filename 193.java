/////////////////////////////////////////////////////
// Function name: FirstOcc
// Description  : return index of first occurrence of thatNO.
// Input        : N : 6
//              : NO: 66
//              : Elements : 85 66 3 66 93 88
// Output       : 1
// Author       : Shivaji Das
// Date         : 1-6-2021
/////////////////////////////////////////////////////

import java.util.*;

class Number
{
	public int FirstOcc(int Arr[],int iNo)
	{
		int iCnt=0;
        for(int i=0;i<Arr.length;i++)
        {
        	
        	if(Arr[i]==iNo)
        	{
        		break;
        	}
        	iCnt++;
        }
        return iCnt;
	}
}

class P2
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

		System.out.println("Enter the the Element to Check First Occuarance");
		int iNo=Sobj.nextInt();

		Number obj=new Number();
		int iRet=obj.FirstOcc(Arr,iNo);
		System.out.println("The First Occurance is : "+iRet);
		
		
	}
}