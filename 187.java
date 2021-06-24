/////////////////////////////////////////////////////
// Function name: CountEven
// Description  : return the count of even digits.
// Input        : 2395
// Output       : 1
// Author       : Shivaji Das
// Date         : 1-6-2021
/////////////////////////////////////////////////////
import java.util.*;

class Digit
{
	public int CountEven(int iNo)
	{
		int iDigit=0,iCnt=0;

		if(iNo<0)
		{
			iNo=-iNo;
		}
         while(iNo>0)
         {
         	iDigit=iNo%10;
         	if(iDigit%2==0)
         	{
         		iCnt++;
         	}
         	iNo=iNo/10;
         }
         return iCnt;
	}
}

class P1
{
	public static void main(String[] args) 
	{
		Scanner Sobj=new Scanner(System.in);
		System.out.println("Enter the number");
		int iNum=Sobj.nextInt();

		Digit obj=new Digit();
		int iRet=obj.CountEven(iNum);
		System.out.println("The Count of the event Digit is "+iRet);
		
	}
}