///////////////////////////////////////////////////////////
// Function Name : Packing()
// Description   : Packed the number(In one Statement)
// Input         : Intiger, Intiger, Intiger, Intiger,
// Output        : longintiger
// Author        : Shivaji Das
// Date          : 9 June 2021
//////////////////////////////////////////////////////////

import java.util.*;

class IPPackUnpack
{
	public int Packing(int no1,int no2, int no3, int no4)
	{
		return((no1<<24) | (no2<<16) | (no3<<8) | no4);
	}
}

class Program211
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Please enter first number");
		int no1 = sobj.nextInt();
		System.out.println("Please enter second number");
		int no2 = sobj.nextInt();
		System.out.println("Please enter third number");
		int no3 = sobj.nextInt();
		System.out.println("Please enter fourth number");
		int no4 = sobj.nextInt();
		IPPackUnpack obj = new IPPackUnpack();
		int ret = obj.Packing(no1,no2,no3,no4);
		System.out.println("Packed number is : "+ret);
	}
}