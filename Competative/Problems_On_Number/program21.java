class program01
{
    public static void main(String[] args)
    {
        logic lobj = new logic();

        lobj.SumEvenNumbers(10);

    }
}

class logic
{
    void SumEvenNumbers(int iNo)
    {
        int iCnt = 0, sum = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                sum = sum + iCnt;
            }
        }
        System.out.println("Addition of even numbers is : "+sum);
    }
}