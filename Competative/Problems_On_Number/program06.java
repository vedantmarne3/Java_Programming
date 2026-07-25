class program03
{
    public static void main(String A[])
    {
        logic lobj = new logic();

        lobj.PrintOddNumber(20);

    }
}

class logic
{
    void PrintOddNumber(int iNo)
    {
        int iCnt = 0;

        System.out.println("Odd numbers : ");

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.println(iCnt);
            }
        }
       
    }
}