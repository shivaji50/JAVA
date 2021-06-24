/////////////////////////////////////////////////////
// Function name: LastOcc
// Description  : return index of last occurrence of thatNO.
// Input        : N : 6
//              : NO: 66
//              : Elements : 85 66 3 66 93 88
// Output       : 3
// Author       : Shivaji Das
// Date         : 1-6-2021
/////////////////////////////////////////////////////

import java.util.*;

class Number
{
	public int LastOcc(int Arr[],int iNo)
	{
		int iCnt=0;
        for(int i=Arr.length-1;i>=0;i--)
        {
        	
        	if(Arr[i]==iNo)
        	{
        		iCnt=i;
        		break;
        	}
        	
        }
        return iCnt;
	}
}

class P3
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

		System.out.println("Enter the the Element to Check Last Occuarance");
		int iNo=Sobj.nextInt();

		Number obj=new Number();
		int iRet=obj.LastOcc(Arr,iNo);
		System.out.println("The Last Occurance is : "+iRet);
		
		
	}
}