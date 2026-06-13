//Type 3

import java.util.Scanner;


class program45
{
        public static void main(String A[])
        {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX(); // NumberX Cha Object cha vapar kela aahe 

        bRet = nobj.CheckDivisible(iValue); 
        
        if(bRet == true)
        {
            System.out.println("Nuber is Divisible by 3 & 5");
        }
        else
        {
            System.out.println("Nuber is not Divisible by 3 & 5");
        }
              
        }
}

class NumberX 
{
    public boolean CheckDivisible(int iNo)
    {
        if((iNo % 3 == 0) && (iNo % 5 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}