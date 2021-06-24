/////////////////////////////////////////////////////
// Function name: Multi
// Description  : return multiplication of all digits.
// Input        : 2395
// Output       : 270
// Author       : Shivaji Das
// Date         : 1-6-2021
/////////////////////////////////////////////////////
import java.util.*;

class Digit
{
	public int Multi(int iNo)
	{
		int iDigit=0,iMult=1;

		if(iNo<0)
		{
			iNo=-iNo;
		}
         while(iNo>0)
         {
         	iDigit=iNo%10;
         	if(iDigit!=0)
         	{
         	   iMult=iMult*iDigit;
         	}
         	iNo=iNo/10;
         }
         return iMult;
	}
}

class P4
{
	public static void main(String[] args) 
	{
		Scanner Sobj=new Scanner(System.in);
		System.out.println("Enter the number");
		int iNum=Sobj.nextInt();

		Digit obj=new Digit();
		int iRet=obj.Multi(iNum);
		System.out.println("The Multiplication of Digit are "+iRet);
		
	}
}