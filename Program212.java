///////////////////////////////////////////////////////////
// Function Name : Unpacking()
// Description   : UnPacked the number
// Input         : longintiger
// Output        : Intiger, Intiger, Intiger, Intiger,
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

	public void Unpacking(int no)
	{
		int no1, no2, no3,no4;
		no1 = no & 0x000000ff;
		no2	= no >> 8;
		no2 = no2 & 0x000000ff;
		no3 = no >> 16;
		no3 = no3 & 0x000000ff;
		no4 = no >> 24;
		System.out.println("First number : "+no1);
		System.out.println("Second number : "+no2);
		System.out.println("Third number : "+no3);
		System.out.println("Fourth number : "+no4);
	}
}

class Program212
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
		obj.Unpacking(ret);
	}
}