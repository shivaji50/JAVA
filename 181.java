////////////////////////////////////////////////////
// Function name : Reverse()
// Description   : display it in reverse order.
// Input         : MarvellouS
// Output        : SuollevraM
// Author        : Shivaji das
// Date          : 22 june 2021
///////////////////////////////////////////////////

import java.util.*;

class StringDemo
{
	public void Reverse(String str)
	{
        char crr[]=str.toCharArray();

        for(int i=crr.length-1;i>=0;i--)
        {
        	System.out.print(""+crr[i]);
        }
        
	}
}

class P5
{
	public static void main(String[] args) {
		
		Scanner Sobj=new Scanner(System.in);

		System.out.println("Enter the string");
        String str=Sobj.nextLine();

        StringDemo sd=new StringDemo();

        sd.Reverse(str);
        
	}
}