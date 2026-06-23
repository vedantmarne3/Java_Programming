import java.util.*;

class program81
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        dobj.DiplayDigit(iValue);
 
    }
}
class DigitX
{
    public void DiplayDigit(int iNo)
    {
        int iDigit = 0;
        int iCnt = 0;

        for(; iNo != 0;)        //for( ; ; ) allowed
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo/10;
        }
    }
}