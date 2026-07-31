class program02
{
    public static void main(String[] args)
    {
        logic lobj = new logic();

        lobj.PrintReverse(10);

    }
}

class logic
{
    void PrintReverse(int iNo)
    {
        int iCnt = 0;

        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }

    }
}