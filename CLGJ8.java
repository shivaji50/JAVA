import java.util.*;

class Sales
{
    String Sname;
    String Pname;
    int Squnatity;
    int Target;
    Scanner sobj=new Scanner(System.in);

    void GetData()
    {
        System.out.println("Enter The Sales Details");
        System.out.println("Enter The Salesman Name");
        Sname=sobj.nextLine();
        System.out.println("Enter The Product Name");
        Pname=sobj.nextLine();
        System.out.println("Enter The Sales Quantity");
        Squnatity=sobj.nextInt();
        System.out.println("Enter The Target");
        Target=sobj.nextInt();

    }

    void Display()
    {
        System.out.println();
        System.out.println("Name is : "+Sname);
        System.out.println("Product Name : "+Pname);
        System.out.println("Sales Quantity : "+Squnatity);
        System.out.println("Target : "+Target);
    }

    int SpecificCommision(String N)
    {
        int id=0;
        float Com=0,Esales=0;
       if(Sname.equals(N)==true)
       {
           id=1;
           if(Squnatity>Target)
           {
               Esales=Squnatity-Target;
               Com=(Esales*0.25f)+(Target*0.10f);
           }
           else if(Squnatity==Target)
           {
               Com=(Target*0.10f);
           }
           else
           {
               Com=0;
           }

           Display();
           System.out.println("Commision Is :"+Com);
       }
       return id;
    }

    void Commision()
    {
        float Com=0,Esales=0;

           if(Squnatity>Target)
           {
               Esales=Squnatity-Target;
               Com=(Esales*0.25f)+(Target*0.10f);
           }
           else if(Squnatity==Target)
           {
               Com=(Target*0.10f);
           }
           else
           {
               Com=0;
           }

           Display();
           System.out.println("Commision Is :"+Com);
    }
}

class CLGJ8
{
    public static void main(String[] args) 
    {
        int iChoice=1,iRet=0;
        String Name;
        Sales obj[];
        Scanner sobj=new Scanner(System.in);

        System.out.println("How Many Records u want");
        int Records=sobj.nextInt();
        
        obj=new Sales[Records];
        for(int i=0;i<Records;i++)
        {
            obj[i]=new Sales();
            obj[i].GetData();
        }
        
        while(iChoice!=0)
        {
            System.out.println("\nMENU");
            System.out.println("1.Find Commision by Name");
            System.out.println("2.Find All Employes Commision");
            System.out.println("0.Exit");
            iChoice=sobj.nextInt();
            sobj.nextLine();
            switch(iChoice)
            {
                case 1:
                System.out.println("Enter The Name");
                Name=sobj.nextLine();
                for(int i=0;i<Records;i++)
                {
                   iRet=obj[i].SpecificCommision(Name);   
                }
                if(iRet==0)
                {
                    System.out.println("User Not Found");
                }
                break;

                case 2:
                for(int i=0;i<Records;i++)
                {
                   obj[i].Commision();   
                }
                break;

                case 0:
                System.out.println("Thanks For Using");
                break;

                default:
                System.out.println("Wrong Option");
                break;
            }
        }

    }
}
