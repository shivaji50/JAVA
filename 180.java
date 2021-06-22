////////////////////////////////////////////////////
// Function name : Vowels()
// Description   : check whether it contains vowels in it or not. 
// Input         : marvellous
// Output        : TRUE
// Author        : Shivaji das
// Date          : 22 june 2021
///////////////////////////////////////////////////
import java.util.*;

class StringDemo
{
	public int Vowels(String str)
	{
        char crr[]=str.toCharArray();
        int iCnt=0;

        for(int i=0;i<crr.length;i++)
        {
        	if((crr[i]=='A')||(crr[i]=='E')||(crr[i]=='I')||(crr[i]=='O')||(crr[i]=='U')||(crr[i]=='a')||(crr[i]=='e')||(crr[i]=='i')||(crr[i]=='o')||(crr[i]=='u'))
        	{
        		iCnt++;
        		break;
        	}
        }
        return iCnt;
	}
}

class P4
{
	public static void main(String[] args) {
		
		Scanner Sobj=new Scanner(System.in);

		System.out.println("Enter the string");
        String str=Sobj.nextLine();

        StringDemo sd=new StringDemo();

        int iRet=sd.Vowels(str);
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