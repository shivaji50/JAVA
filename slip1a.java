//slip1.a
//write a java program to accept n names of cities from user
//and display them in desending order
import java.util.*;
import java.lang.*;
class slip1a
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("How many cities do u want");
		n=sc.nextInt();
		String s[]=new String[n];
		System.out.println("Enter the cities");
		for(i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		System.out.println("Sorting");
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(s[j].compareTo(s[i])>0)
				{
					String t=s[i];
					s[i]=s[j];
					s[j]=t;
				}
			}
		}
		for(i=0;i<n;i++)
			{System.out.println(""+s[i]);}
		
	}
}