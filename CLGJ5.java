import java.util.*;

class Arithmetic
{
    public int sum(int no1,int no2)
    {
        return no1+no2;
    }

    public float sum(float no1,float no2,float no3)
    {
        return no1+no2+no3;
    }

    public int sum(int arr[],int no)
    {
        int sum=0;
        for(int i=0;i<no;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }
}


class CLGJ5 
{
    public static void main(String[] args) 
    {
        int Element=0,num1=0,num2=0,iRet=0,iChoice=1,iSize=0;
        float fnum1=0.0f,fnum2=0.0f,fnum3=0.0f,fRet=0.0f;
        int arr[];
        Arithmetic obj=new Arithmetic();
        Scanner Sobj=new Scanner(System.in);

        while(iChoice!=0)
        {
            System.out.println("Menu");
            System.out.println("1.Addition of 2 Integer numbers");
            System.out.println("2.Addition of 3 Float numbers");
            System.out.println("3.Addition of Array Elements");;
            System.out.println("0.Exit");
            iChoice=Sobj.nextInt();

            switch(iChoice)
            {
               case 1:
               System.out.println("Enter The First Number");
               num1=Sobj.nextInt();
               System.out.println("Enter The Second Number");
               num2=Sobj.nextInt();
               iRet=obj.sum(num1,num2);
               System.out.println("The Addition is"+iRet);
               break;

               case 2:
               System.out.println("Enter The First Number");
               fnum1=Sobj.nextFloat();
               System.out.println("Enter The Second Number");
               fnum2=Sobj.nextFloat();
               System.out.println("Enter The Third Number");
               fnum3=Sobj.nextFloat();
               fRet=obj.sum(fnum1,fnum2,fnum3);
               System.out.println("The Addition is"+fRet);
               break;

               case 3:
               System.out.println("Enter The Size of The Array");
               iSize=Sobj.nextInt();
               arr=new int[iSize];
               for(int i=0;i<iSize;i++)
               {
                   System.out.println("Enter The Element "+(i+1));
                   Element=Sobj.nextInt();
                   arr[i]=Element;
               }
               iRet=obj.sum(arr,iSize);
               System.out.println("The Addition of Array is "+iRet);
               break;

               case 0:
               System.out.println("Thanks For Using The Application");
               break;

               default:
               System.out.println("Wrong Option");
               break;

            }
        }

    }
}
