/////////////////////////////////////////////////////////
// Function Name : main()
// Description   : A program to take input and Display that String
// Input         : String
// Output        : String
// Author        : Shivaji Das
// Date          : 8 June 2021
///////////////////////////////////////////////////////
import java.util.*;

class Program204
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please enter string");
		
		String str = sobj.nextLine();
		
		System.out.println("Entered string is : "+str);
	}
}