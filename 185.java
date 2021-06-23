////////////////////////////////////////////////////
// Function name : Display()
// Description   : display all such elements which are divisible by 3 and 5.
// Input         : N : 6
//                 Elements : 85 66 3 15 93 88
// Output        : 15
// Author        : Shivaji das
// Date          : 23 june 2021
///////////////////////////////////////////////////
import java.util.*;

class ArrayDemo
{
	public void Display(int Arr[])
	{
		System.out.println("The elements Divisible by 5 and 3 are");
       for(int i=0;i<Arr.length;i++)
       {
       	  if((Arr[i]%5==0)&&(Arr[i]%3==0))
       	 {
       		System.out.print("\t"+Arr[i]);
       	 }
       }
	}
}

class P4
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