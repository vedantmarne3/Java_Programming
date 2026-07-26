class program05
{
    public static void main(String A[])
    {
        logic lobj = new logic();

        lobj.CheckSign(99);

    }
}

class logic
{
    void CheckSign(int iNo)
    {
        if(iNo < 0)
        {
            System.out.println(iNo+" is Nagitive");
        }
        else if(iNo > 0)
        {
            System.out.println(iNo+" is Positive");
        }
        else
        {
            System.out.println("Zero");
        }
       
    }
}