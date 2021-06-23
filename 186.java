////////////////////////////////////////////////////
// Function name : Display()
// Description   : display all such elements which are multiples of 11. 
// Input         : N : 6
//                 Elements : 85 66 3 55 93 88
// Output        : 66 55 88
// Author        : Shivaji das
// Date          : 23 june 2021
///////////////////////////////////////////////////
import java.util.*;

class ArrayDemo
{
	public void Display(int Arr[])
	{
		System.out.println("The elements Multiple of 11 are");
       for(int i=0;i<Arr.length;i++)
       {
       	  if(Arr[i]%11==0)
       	 {
       		System.out.print("\t"+Arr[i]);
       	 }
       }
	}
}

class P5
{
	public static void main(String[] args) 
	{
		Scanner Sobj=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size=Sobj.nextInt();
		int Arr[]=new int[size];

        System.out.println("Enter the Elements of the Array");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=Sobj.nextInt();
		}

		ArrayDemo obj=new ArrayDemo();
		obj.Display(Arr);
		
	}
}