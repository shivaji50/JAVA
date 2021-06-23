////////////////////////////////////////////////////
// Function name : Difference()
// Description   : return difference between summation of even elements and summation of odd elements.
// Input         : N : 6
//                 Elements : 85 66 3 80 93 8
// Output        : 53 (234 - 181)
// Author        : Shivaji das
// Date          : 23 june 2021
///////////////////////////////////////////////////
import java.util.*;

class ArrayDemo
{
    private int iSize;
    private int Arr[];
    Scanner Sobj=new Scanner(System.in);
    public ArrayDemo(int i)
    	{
    		iSize=i;
    		Arr=new int[iSize];
    	}

    public void Accept()
    {
    	System.out.println("Enter the Elements of the array");
    	for(int i=0;i<Arr.length;i++)
    	{
    		Arr[i]=Sobj.nextInt();

    	}
    }	

    public int Difference()
    {
    	int sume=0,sumo=0;

    	for(int i=0;i<Arr.length;i++)
    	{
    		if(Arr[i]%2==0)
    		{
    			sume=sume+Arr[i];
    		}
    		if(Arr[i]%2!=0)
    		{
    			sumo=sumo+Arr[i];
    		}
    	}
    	return sume-sumo;
    }
}

class P1
{
	public static void main(String[] args) 
	{
		Scanner Sobj=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=Sobj.nextInt();

		ArrayDemo obj=new ArrayDemo(size);
		obj.Accept();
		int iRet=obj.Difference();
		System.out.println("The Difference is "+iRet);
		
	}
}