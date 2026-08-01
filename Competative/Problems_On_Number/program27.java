class program05
{
    public static void main(String A[])
    {
        logic lobj = new logic();

        lobj.printDivisibleBy2and3(30);;

    }
}

class logic
{
    void printDivisibleBy2and3(int iNo)
    {
        int iCnt = 0;

        System.out.println(iNo+" Divisible By 2 and 3 is : ");
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0 && iCnt % 3 == 0)
            {
                System.out.print(iCnt+"\t");
            }
        }
        

    }
}