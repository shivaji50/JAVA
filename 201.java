/////////////////////////////////////////////////////
// Function name: Cat
// Description  : check whether the string is palindrome or not without considering its case. 
// Input        : “1abccBA1”
// Output       : TRUE
// Author       : Shivaji Das
// Date         : 26-6-2021
/////////////////////////////////////////////////////
import java.util.*;

class StringDemo
{
	public int Cat(String src)
	{
		String temp1=src.trim().replaceAll("[ ]{2,}"," ");
		String Arr1[]=temp1.split(" ");
    String rev="";
		
    for(int i=0;i<Arr1.length;i++)
	  {
	  	StringBuffer bobj=new StringBuffer(Arr1[i]);
	  	rev=rev+bobj.reverse();
	  	bobj=null;
	  }

       if(rev.equalsIgnoreCase() (src))
       {
       	return 1;
       }
       else
       {
       	return 0;
       }
	}
} 

class P5
{
	public static void main(String[] args) 
	{
		Scanner Sobj=new Scanner(System.in);
		System.out.println("Enter the First String");
		String s1=Sobj.nextLine();
		
		StringDemo obj=new StringDemo();

		int ret=obj.Cat(s1);
		if(ret==1)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
		
		
	}
}