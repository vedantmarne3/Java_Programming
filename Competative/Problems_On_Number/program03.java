
class program05
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.printTable(5);
    }
}

class Logic
{

    void printTable(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.println(iNo+" * "+iCnt+ " = " + iNo * iCnt);
        }
    }
}