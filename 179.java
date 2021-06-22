////////////////////////////////////////////////////
// Function name : Difference()
// Description   : return difference between frequency of small characters and frequency of capital characters.
// Input         : MarvellouS
// Output        : 6 (8-2)
// Author        : Shivaji das
// Date          : 22 june 2021
///////////////////////////////////////////////////
import java.util.*;

class StringDemo
{
	public int Difference(String str)
	{
        char crr[]=str.toCharArray();
        int iCnt=0,iCntC=0,iCntS=0;

        for(int i=0;i<crr.length;i++)
        {
        	if((crr[i]>='A')&&(crr[i]<='Z'))
        	{
        		iCntC++;
        	}
        	if((crr[i]>='a')&&(crr[i]<='z'))
        	{
        		iCntS++;
        	}
        }
        return iCnt=iCntS-iCntC;
	}
}

class P3
{
	public static void main(String[] args) {
		
		Scanner Sobj=new Scanner(System.in);

		System.out.println("Enter the string");
        String str=Sobj.nextLine();

        StringDemo sd=new StringDemo();

        int iRet=sd.Difference(str);
        System.out.println("The Difference is "+iRet);
	}
}