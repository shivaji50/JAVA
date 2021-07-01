/////////////////////////////////////////////////////
// Function name: Design
// Description  : display below pattern.
// Input        : Hello   
//
// Output       : H e l l o 
//                H e l l o 
//                H e l l o 
//                H e l l o
// Author       : Shivaji Das
// Date         : 2-7-2021
/////////////////////////////////////////////////////
import java.util.*;

class Pattern
{
	public void Design(String str)
	{
      char st[]=str.toCharArray();

      for(int i=0;i<st.length;i++)
      {
      	for(int j=0;j<st.length;j++)
      	{
      		System.out.print(st[j]+"\t");
      	}
      	System.out.println();
      }
	}
}

class P1
{
	public static void main(String[] args) 
	{
	   Scanner Sobj=new Scanner(System.in);

	   System.out.println("Enter the String ");
	   String str=Sobj.nextLine();

	   Pattern obj=new Pattern();
	   obj.Design(str);

	}
}