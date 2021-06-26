/////////////////////////////////////////////////////
// Function name: Cat
// Description  : concat N characters of second string after first string
// Input        : “Marvellous Infosystems”
//              : “Logic Building”
//                 5
// Output       : “Marvellous Infosystems Logic”
// Author       : Shivaji Das
// Date         : 26-6-2021
/////////////////////////////////////////////////////
import java.util.*;

class StringDemo
{
	public String Cat(String src,String des,int iCnt)
	{
       src.trim().replaceAll("[ ]{2,}"," ");
       String Arr[]=src.split(" ");
       String output=" ";
       String bobj=" ";
      
       if(iCnt>des.length())
       {
       	 System.out.println("your Entered Length is more then the String length");
       	 System.exit(0);
       }

       if(Arr.length-1>1)
       {
       	  if(Arr[2].length()>des.length())
          {
            output=src+" "+des;
            return output;
          }
       }
       
       	  for(int i=0;i<iCnt;i++)
       	  {
       	  	bobj=bobj+des.charAt(i);
       	  }
       	  output=src+bobj;
       
       return output;
       
	}
} 

class P1
{
	public static void main(String[] args) 
	{
		Scanner Sobj=new Scanner(System.in);
		System.out.println("Enter the First String");
		String s1=Sobj.nextLine();
		System.out.println("Enter the Second String");
		String s2=Sobj.nextLine();
		System.out.println("Enter the number");
		int iNum=Sobj.nextInt();

		StringDemo obj=new StringDemo();

		String ret=obj.Cat(s1,s2,iNum);
		System.out.println("After concation "+ret);
		
	}
}