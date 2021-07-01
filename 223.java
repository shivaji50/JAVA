/////////////////////////////////////////////////////
// Function name: Design
// Description  : display below pattern.
// Input        : Hello   
//
// Output       : H e l l o 
//                H e l l 
//                H e l 
//                H e 
//                H
// Author       : Shivaji Das
// Date         : 2-7-2021
/////////////////////////////////////////////////////
import java.util.*;

class Pattern
{
	public void Design(String str)
	{
      char st[]=str.toCharArray();
      int iCnt=0;

      for(int i=st.length-1;i>=0;i--)
      {
      	for(int j=0;j<=i;j++)
      	{
      		System.out.print(st[j]+"\t");
      	}
      	
      	System.out.println();
      }
	}
}

class P2
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