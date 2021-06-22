////////////////////////////////////////////////////
// Function name : CountSmall()
// Description   : count number of Small characters.
// Input         : Marvellous
// Output        : 9
// Author        : Shivaji das
// Date          : 22 june 2021
///////////////////////////////////////////////////
import java.util.*;

class StringDemo
{
	public int CountSmall(String str)
	{
        char crr[]=str.toCharArray();
        int iCnt=0;

        for(int i=0;i<crr.length;i++)
        {
        	if((crr[i]>='a')&&(crr[i]<='z'))
        	{
        		iCnt++;
        	}
        }
        return iCnt;
	}
}

class P2
{
	public static void main(String[] args) {
		
		Scanner Sobj=new Scanner(System.in);

		System.out.println("Enter the string");
        String str=Sobj.nextLine();

        StringDemo sd=new StringDemo();

        int iRet=sd.CountSmall(str);
        System.out.println("The count of Small letter is "+iRet);
	}
}