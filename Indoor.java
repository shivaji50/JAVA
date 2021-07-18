//slip6.a-indoor
//37
//write a package for games in java,which have two classes
//as indoor and outdoor.use a function display() to generate
//the list of players for the specific games.(use parametrized constructor
//,finalize method and array of objects).
package Games;
public class Indoor
{
	String name;
	int age;
	public Indoor()
	{
		name="ABC";
		age=18;
	}
	public Indoor(String s,int a)
	{
		name=s;
		age=a;
	}
	public void display()
	{
		System.out.println("\nIndoor games detail are as follow\n");
		System.out.println("\n Name: "+name+"\tAge "+age);
	}
}