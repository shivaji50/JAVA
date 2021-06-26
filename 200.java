/////////////////////////////////////////////////////
// Function name: Cat
// Description  : reverse the contents of that string by toggling the case. 
// Input        : “aCBdef”
// Output       : “FEDcbA”
// Author       : Shivaji Das
// Date         : 26-6-2021
/////////////////////////////////////////////////////
import java.util.*;

class StringDemo
{
	public String Tog(String str)
	{
      String temp1=str.trim().replaceAll("[ ]{2,}"," ");
	  String Arr1[]=temp1.split(" ");
	  String rev="";
	  String rev1="";
	  String n="";

	  for(int i=0;i<Arr1.length;i++)
	  {
	  	StringBuffer bobj=new StringBuffer(Arr1[i]);
	  	rev=rev+bobj.reverse()+" ";
	  	bobj=null;
	  }

     char crr[]=rev.toCharArray();


     for(int i=0;i<crr.length;i++)
     {
     	if((crr[i]>='A')&& (crr[i]<='Z'))
     	{
     		 n=n+crr[i];
     		StringBuffer bj=new StringBuffer(n);
     		rev1=rev1+bj.toString().toLowerCase();
     		n="";
     		bj=null;
     	}
     	else if((crr[i]>='a')&& (crr[i]<='z'))
     	{
     		 n=n+crr[i];
     		StringBuffer bj1=new StringBuffer(n);
     		rev1=rev1+bj1.toString().toUpperCase();
            
            n="";
     		bj1=null;
     	}
     	else if(crr[i]==' ')
         {
            rev1=rev1+' ';
         }
         else
         {

         }
     }

     //System.out.println(rev1);
	  return rev1;
	}
}

class P4
{
	public static void main(String[] args) 
	{
		Scanner Sobj=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=Sobj.nextLine();

		StringDemo obj=new StringDemo();

		String s=obj.Tog(str);
		System.out.println("Modified String "+s);

	}
}