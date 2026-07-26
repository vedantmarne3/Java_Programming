class program03
{
    public static void main(String A[])
    {
        logic lobj = new logic();

        lobj.CheckDivisible(55);;

    }
}

class logic
{
    void CheckDivisible(int iNo)
    {

        if((iNo % 5 == 0) && (iNo % 11 == 0))
        {
            System.out.println("Number is Divisible by 11 & 5");
        }
        else
        {
            System.out.println("Number is not Divisible by 11 & 5");
        }
    }
}