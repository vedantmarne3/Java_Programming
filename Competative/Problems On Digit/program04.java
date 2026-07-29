class program04
{
    public static void main(String[] args)
    {
        logic lobj = new logic();

        lobj.findLargestDigit(83942);;

    }
}

class logic
{
    void findLargestDigit(int iNo)
    {
        int iDigit = 0, Max = 0;

        int temp = iNo;

        while(iNo != 0)
        {

            iDigit = iNo % 10;

            if(iDigit > Max)
            {
                Max = iDigit;
            }

            iNo = iNo / 10;
        }

        System.out.println("Largest Digit in "+temp+" is : "+Max);
    }

}