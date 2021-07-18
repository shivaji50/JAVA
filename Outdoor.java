//slip6.a-outdoor
//37
//write a package for games in java,which have two classes
//as indoor and outdoor.use a function display() to generate
//the list of players for the specific games.(use parametrized constructor
//,finalize method and array of objects).
package Games;
public class Outdoor
{
	String name;
	int age;
	int team;
	public Outdoor()
	{
		name="ABC";
		age=18;
		team=11;
	}
	public Outdoor(String s,int a,int t)
	{
		name=s;
		age=a;
		team=t;
	}
	public void display()
	{
		System.out.println("\nOutdoor games detail are as follow\n");
		System.out.println("\n Name: "+name+"\tAge "+age+"\t Team size "+team);
	}
}