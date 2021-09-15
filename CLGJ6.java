import java.util.*;

class Person
{
    String PersonName;
    String City;
    long Mobno;
    Scanner sobj=new Scanner(System.in);

  public void Details()
  {
      System.out.println("Enter The Name");
      PersonName=sobj.nextLine();
      System.out.println("Enter The City");
      City=sobj.nextLine();
      System.out.println("Enter The Number");
      Mobno=sobj.nextLong();
  }

  public void Display()
  {
      System.out.println(PersonName);
      System.out.println(City);
      System.out.println(Mobno);
  }

  public void Search(long Mb)
  {
      if(Mobno==Mb)
      {
        System.out.println(PersonName);
        System.out.println(City);
        System.out.println(Mobno);
      }
  }

  public void Search(String N)
  {
     if((PersonName.equals(N))==true)
     {
        System.out.println(PersonName);
        System.out.println(City);
        System.out.println(Mobno);
     }
  }
}
class CLGJ6
{
    public static void main(String[] args) 
    {
        int iChoice=1;
        String Nam;
        long Number;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter How Many Records u want to Enter");
        int Records=sobj.nextInt();

        Person obj[]=new Person[Records];
        for(int i=0;i<Records;i++)
        {
            obj[i]=new Person();
        }

        System.out.println("Enter The Records");
        for(int i=0;i<Records;i++)
        {
            obj[i].Details();
        }

        while(iChoice!=0)
        {
            System.out.println("\nMenu");
            System.out.println("1.Display");
            System.out.println("2.Search by Name");
            System.out.println("3.Search by Number");
            System.out.println("0.Exit");
            iChoice=sobj.nextInt();
            sobj.nextLine();
            switch(iChoice)
            {
                case 1:
                for(int i=0;i<Records;i++)
                {
                     obj[i].Display();
                }
                break;

                case 2:
                System.out.println("Enter The Names");
                Nam=sobj.nextLine();
                for(int i=0;i<Records;i++)
                {
                     obj[i].Search(Nam);
                }
                break;

                case 3:
                System.out.println("Enter The Number");
                Number=sobj.nextLong();
                for(int i=0;i<Records;i++)
                {
                     obj[i].Search(Number);
                }
                break;

                case 0:
                System.out.println("Thanks For Using");
                break;

                default:
                System.out.println("Wrong option");
                break;
            }
        }

        
    }
}