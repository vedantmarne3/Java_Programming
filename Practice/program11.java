//Type 3

import java.util.Scanner;


class program44
{
        public static void main(String A[])
        {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        bRet = NumberX.CheckDivisible(iValue); // hyachyat NumberX cha object nahi banavla
        
        if(bRet == true)
        {
            System.out.println("Number is Divisible by 3 & 5");
        }
        else
        {
            System.out.println("Number is not Divisible by 3 & 5");
        }
              
        }
}

class NumberX // name conflict to avoid that X
{
    public static boolean  CheckDivisible(int iNo)
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