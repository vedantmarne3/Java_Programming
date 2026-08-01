class program02
{
    public static void main(String A[])
    {
        logic lobj = new logic();

        lobj.countEvenOddRange(50);;

    }
}

class logic
{
    void countEvenOddRange(int iNo)
    {
        int iCnt = 0, Even = 0, Odd = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                Even++;
            }
            else
            {
                Odd++;
            }
        }

        System.out.println("Number of Even is : "+Even);
        System.out.println("Number of Odd is : "+Odd);


    }
}