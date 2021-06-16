///////////////////////////////////////////////////////////
// Function Name : CharacterFrequency()
// Description   : To Find the frequency of each character in string(using Hashtable)
// Input         : Hellllo 
// Output        : {e=1, o=1, l=4, H=1}
// Author        : Shivaji Das
// Date          : 16 June 2021
//////////////////////////////////////////////////////////

import java.util.*;

class Demo
{
	public void CharacterFrequency(String str)
	{
		char Arr[] = str.toCharArray();
		
		HashMap <Character,Integer> hobj = new HashMap<Character,Integer>();
		for(char ch : Arr)
		{
			if(hobj.containsKey(ch))
			{
				hobj.put(ch,hobj.get(ch)+1);
			}
			else
			{
				hobj.put(ch,1);
			}
		}
		System.out.println(hobj);
	}
}

class Program238
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
		Demo dobj = new Demo();
		dobj.CharacterFrequency(str);
	}
}




































