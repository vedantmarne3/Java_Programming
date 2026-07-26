class program01
{
    public static void main(String A[])
    {
        logic lobj = new logic();

        lobj.CheckLeepYear(2026);;

    }
}

class logic
{
    void CheckLeepYear(int year)
    {
        if(year % 400 == 0)
        {
            System.err.println(year+" Is a Leep year");
        } 
        else if(year % 100 == 0)
        {
            System.out.println(year+" Is not Leep year");
        }
        else if(year % 4 == 0)
        {
            System.out.println(year+" Is Leep a year");
        }
        else
        {
            System.out.println(year+" Is not Leep year");
        }
    }
}