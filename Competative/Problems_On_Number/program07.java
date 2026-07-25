class program04
{
    public static void main(String A[])
    {
        logic lobj = new logic();

        lobj.SumOddNumber(12345614);

    }
}

class logic
{
    void SumOddNumber(int iNo)
    {
        int iCnt = 0, iDigit = 0;
        int OddSum = 0, EvenSum = 0;

        System.out.println("Odd numbers : ");

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            while(iNo != 0)
            {
                iDigit = iNo % 10;

                if(iDigit % 2 == 0)
                {
                    EvenSum = EvenSum + iDigit;
                }
                else
                {
                    OddSum = OddSum + iDigit;
                }

                iNo = iNo / 10;
            }
        }

        System.out.println("Summation of Even Digit is : "+EvenSum);

        System.out.println("Summation of Odd Digit is : "+OddSum);
       
    }
}