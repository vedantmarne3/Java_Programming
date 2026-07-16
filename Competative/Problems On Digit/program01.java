
class program01
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.SumDigit(12348);
    }
}

class Logic
{

    void SumDigit(int num)
    {
        int iDigit = 0, iSum = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            iSum = iSum + iDigit;
            num = num / 10;
        }

        System.out.println("Summation of Digit is : "+iSum);   


    }
}