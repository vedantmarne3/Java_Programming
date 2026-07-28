class program01
{
    public static void main(String A[])
    {
        logic lobj = new logic();

        lobj.CheckPrime(7);

    }
}

class logic
{
    void CheckPrime(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 2; iCnt < iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.println("It is not a Prime Number!");
                return;
            }
        }
        System.out.println("It is Prime Number!");
    }
}