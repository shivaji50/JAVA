/////////////////////////////////////////////////////////
// Function Name : main()
// Description   : Addition of 2 number in main function by taking input
// Input         : Intiger,Intiger
// Output        : Intiger
// Author        : Shivaji Das
// Date          : 6 June 2021
///////////////////////////////////////////////////////

import java.util.*;

class Program195
{
	public static void main(String arg[])
	{
		int no1,no2,ans;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter first number");
		no1 = sobj.nextInt();
		
		System.out.println("Enter second number");
		no2 = sobj.nextInt();
		
		ans = no1 + no2;
		
		System.out.println("Addition is : "+ans);
	}
}