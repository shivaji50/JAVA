/////////////////////////////////////////////////////////
// Function Name : CapCount()
// Description   : Count the number of Capital letter in a String
// Input         : String
// Output        : 1
// Author        : Shivaji Das
// Date          : 8 June 2021
///////////////////////////////////////////////////////
import java.util.*;

class StringX
{
	public int CapCount(String str)
	{
		char arr[] = str.toCharArray();
		int iCnt = 0;
		for(int i = 0; i< arr.length; i++)
		{
			if((arr[i] >= 'A') && (arr[i] <= 'Z'))
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}

class Program206
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please enter string");
		
		String str = sobj.nextLine();

		StringX obj = new StringX();
		int iRet = obj.CapCount(str);
		System.out.println("Number of capital letters are : "+iRet);		
	}
}