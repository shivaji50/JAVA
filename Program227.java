///////////////////////////////////////////////////////////
// Function Name : main()
// Description   : To Find Length of String and trim the String usng trim and replace all function(Different Approach)
// Input         : String
// Output        : String,Integer
// Author        : Shivaji Das
// Date          : 14 June 2021
//////////////////////////////////////////////////////////

import java.util.*;

class Program227
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
		System.out.println("String length is : "+str.length());
		String temp = str.trim();
		System.out.println("New string is : "+temp);
		System.out.println("Length of new string is : "+temp.length());
		String temp2 = temp.replaceAll("\\s{2,}","");
		System.out.println("Modified string is : "+temp2);
	}
}




