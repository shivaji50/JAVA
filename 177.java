////////////////////////////////////////////////////
// Function name : CountCapital()
// Description   : count number of capital characters.
// Input         : Marvellous Multi OS
// Output        : 4
// Author        : Shivaji das
// Date          : 22 june 2021
///////////////////////////////////////////////////
import java.util.*;

class StringDemo
{
	public int CountCapital(String str)
	{
        char crr[]=str.toCharArray();
        int iCnt=0;

        for(int i=0;i<crr.length;i++)
        {
        	if((crr[i]>='A')&&(crr[i]<='Z'))
        	{
        		iCnt++;
        	}
        }
        return iCnt;
	}
}

class P1
{
	public static void main(String[] args) {
		
		Scanner Sobj=new Scanner(System.in);

		System.out.println("Enter the string");
        String str=Sobj.nextLine();

        StringDemo sd=new StringDemo();

        int iRet=sd.CountCapital(str);
        System.out.println("The count of Capital letter is "+iRet);
	}
}