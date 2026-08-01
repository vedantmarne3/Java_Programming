class program04
{
    public static void main(String A[])
    {
        logic lobj = new logic();

        lobj.displayFactors(20);

    }
}

class logic
{
    void displayFactors(int iNo)
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
               iCount++;
            }
        }

        System.out.println("Total No. of Factors is : "+iCount);
        

    }
}