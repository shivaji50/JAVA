//slip6.a-outdoor
//37
//write a package for games in java,which have two classes
//as indoor and outdoor.use a function display() to generate
//the list of players for the specific games.(use parametrized constructor
//,finalize method and array of objects).
import Games.*;
//import Games.Outdoor;
class slip6a
{
	public static void main(String[] args)
 {
	Games.Indoor i1=new Games.Indoor();
	Games.Indoor i2=new Games.Indoor("shiva",50);
	i1.display();
	i2.display();
	Games.Outdoor o1=new Games.Outdoor();
	Games.Outdoor o2=new Games.Outdoor("Dhoni",40,7);
	o1.display();
	o2.display();
 }	
}