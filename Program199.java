/////////////////////////////////////////////////////////
// Function Name : GenRoot()
// Description   : Find General Root of number.
// Input         : 927
// Output        : 9
// Author        : Shivaji Das
// Date          : 7 June 2021
///////////////////////////////////////////////////////

import java.util.*;

// 927	->	18	->	9
// 9975	->	30	->	3
// 89457 ->	33	-> 6	
// 8	-> 8
// 23 -> 5

class Digits
{
	int GenRoot(int iNo)	// 927
	{
		int iSum = iNo;	// 927

		while(iSum > 9)		// 18
		{	
			iNo = iSum;		// 927		18
			iSum = 0;
			while(iNo != 0)
			{
				iSum = iSum + (iNo % 10);	//279-18-9
				iNo = iNo / 10;
			}
		}
		return iSum;
	}
}

class Program199
{
	public static void main(String arg[])
	{
		int no,ret;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number");
		no = sobj.nextInt();
		
		Digits dobj = new Digits();
		ret = dobj.GenRoot(no);
		System.out.println("Generic root is : "+ret);

	}
}