/////////////////////////////////////////////////////
// Function name: Difference
// Description  : return difference between summation of even digits and summation of odddigits.
// Input        : 2395
// Output       : -15 (2 - 17)
// Author       : Shivaji Das
// Date         : 1-6-2021
/////////////////////////////////////////////////////
import java.util.*;

class Digit
{
	public int Difference(int iNo)
	{
		int iDigit=0,iSume=0,iSumo=0;

		if(iNo<0)
		{
			iNo=-iNo;
		}
         while(iNo>0)
         {
         	iDigit=iNo%10;
         	if(iDigit%2==0)
         	{
         		iSume=iSume+iDigit;
         	}
         	if(iDigit%2!=0)
         	{
         		iSumo=iSumo+iDigit;
         	}
         	iNo=iNo/10;
         }
         return iSume-iSumo;
	}
}

class P5
{
	public static void main(String[] args) 
	{
		Scanner Sobj=new Scanner(System.in);
		System.out.println("Enter the number");
		int iNum=Sobj.nextInt();

		Digit obj=new Digit();
		int iRet=obj.Difference(iNum);
		System.out.println("The Difference is "+iRet);
		
	}
}