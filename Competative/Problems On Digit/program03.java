class program04
{
    public static void main(String[] args) 
    {
        logic lobj = new logic();

        lobj.PrintDigits(9876);

    }
}

class logic 
{
    void PrintDigits(int iNo)
    {
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.print(iDigit+"\t");
            iNo = iNo / 10;
        }
    }
}