class program03
{
    public static void main(String[] args)
    {
        logic lobj = new logic();

        lobj.CheckPerfect(28);

    }
}

class logic
{
    void CheckPerfect(int iNo)
    {
        int iCnt = 0, perfect = 0;

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                perfect = perfect + iCnt;
            }
            
        }

        if(perfect == iNo)
        {
            System.out.println(iNo+" It is perfect Number");
        }
        else
        {
            System.out.println(iNo+" It is not perfect number");
        }

    }
}