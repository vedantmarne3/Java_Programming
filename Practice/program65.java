import java.util.Scanner;

class NumberX
{
    public boolean CheckPrime(int iNo)
    {
        int iCnt = 0;
        

        //ino = 13

                             // 13 / 2 = 6
        for(iCnt = 2; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)   //In case of ino % icnt == 0 aalyavr loop tithch stop honar. suppose 2 la stop zala 
            {
                break;
            }
        }
        //last la shevtcha increment hota tevha 6 che iCnt = 7 hota

           //7      //7
        if(iCnt >= (iNo/2)+1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
   
}

class program65
{
    public static void main(String A[])
    {
    Scanner sobj = new Scanner(System.in);

    int iValue = 0;
    boolean bRet = false;

    System.out.println("Enter number : ");
    iValue = sobj.nextInt();

    NumberX nobj = new NumberX();

    bRet = nobj.CheckPrime(iValue);

    if(bRet == true)
    {
        System.out.println("It is prime");
    }
    else
    {
        System.out.println("It is Not prime");
    }

    }
}
//Time Complexity : O(N/2)  order By N by 2
// Where N >= 0
