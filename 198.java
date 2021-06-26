/////////////////////////////////////////////////////
// Function name: Cat
// Description  : check whether contents of two strings are equal or not. 
// Input        : “Marvellous Infosystems”
//              : “Marvellous Infosystems”
// Output       : TRUE
// Author       : Shivaji Das
// Date         : 26-6-2021
/////////////////////////////////////////////////////
import java.util.*;

class StringDemo
{
	public int Cat(String src,String des)
	{
		   src.trim().replaceAll("[ ]{2,}"," ");
		   des.trim().replaceAll("[ ]{2,}"," ");
       if(src.equals(des))
       {
       	return 1;
       }
       else
       {
       	return 0;
       }
	}
} 

class P2
{
	public static void main(String[] args) 
	{
		Scanner Sobj=new Scanner(System.in);
		System.out.println("Enter the First String");
		String s1=Sobj.nextLine();
		System.out.println("Enter the Second String");
		String s2=Sobj.nextLine();
		

		StringDemo obj=new StringDemo();

		int ret=obj.Cat(s1,s2);
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