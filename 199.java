/////////////////////////////////////////////////////
// Function name: Cat
// Description  : check whether first Parameter contents of two strings are equal or not. 
// Input        : “Marvellous Infosystems”
//              : “Marvellous logic”
// Output       : TRUE
// Author       : Shivaji Das
// Date         : 26-6-2021
/////////////////////////////////////////////////////
import java.util.*;

class StringDemo
{
	public int Cat(String src,String des)
	{
		String temp1=src.trim().replaceAll("[ ]{2,}"," ");
		String temp2=des.trim().replaceAll("[ ]{2,}"," ");
		String Arr1[]=temp1.split(" ");
		String Arr2[]=temp2.split(" ");
        String output="";
		if(Arr1.length-1>1)
       {
       	  if(Arr1[2].length()>temp2.length())
          {
            output=src+" "+des;
            System.out.println(output);
          }
       }

       if(Arr1[0].equals(Arr2[0]))
       {
       	return 1;
       }
       else
       {
       	return 0;
       }
	}
} 

class P3
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