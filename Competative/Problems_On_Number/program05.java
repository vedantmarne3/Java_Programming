class program02
{
    public static void main(String A[])
    {
        logic lobj = new logic();

        lobj.PrintEvenNumber(20);

    }
}

class logic
{
    void PrintEvenNumber(int iNo)
    {
        int iCnt = 0;

        System.out.println("Even numbers : ");

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.println(iCnt);
            }
        }
       
    }
}