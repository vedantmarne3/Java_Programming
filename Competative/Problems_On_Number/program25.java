class program03
{
    public static void main(String A[])
    {
        logic lobj = new logic();

        lobj.displayFactors(12);

    }
}

class logic
{
    void displayFactors(int iNo)
    {
        int iCnt = 0;

        System.out.println("Factors of "+ iNo+" is : ");
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.print(iCnt+"\t");
            }
        }


    }
}