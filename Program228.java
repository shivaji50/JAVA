///////////////////////////////////////////////////////////
// Function Name : main()
// Description   : To Check no of words in a String
// Input         : Hello i am shiva
// Output        : 4
// Author        : Shivaji Das
// Date          : 15 June 2021
//////////////////////////////////////////////////////////

import java.util.*;

class Program228
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
		String temp = str.trim();
		String arr[] = temp.split("\\s");
		System.out.println("Number of words are : "+arr.length);
	}
}




