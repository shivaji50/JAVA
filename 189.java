/////////////////////////////////////////////////////
// Function name: Count
// Description  : return the count of digits in between 3 and 7.
// Input        : 2395
// Output       : 1
// Author       : Shivaji Das
// Date         : 1-6-2021
/////////////////////////////////////////////////////
import java.util.*;

class Digit
{
	public int Count(int iNo)
	{
		int iDigit=0,iCnt=0;

		if(iNo<0)
		{
			iNo=-iNo;
		}
         while(iNo>0)
         {
         	iDigit=iNo%10;
         	if((iDigit>3)&&(iDigit<7))
         	{
         		iCnt++;
         	}
         	iNo=iNo/10;
         }
         return iCnt;
	}
}

class P3
{
	public static void main(String[] args) 
	{
		Scanner Sobj=new Scanner(System.in);
		System.out.println("Enter the number");
		int iNum=Sobj.nextInt();

		Digit obj=new Digit();
		int iRet=obj.Count(iNum);
		System.out.println("The Count of Digit between 3 and 7 are "+iRet);
		
	}
}