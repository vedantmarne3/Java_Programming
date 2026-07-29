class program05
{
    public static void main(String[] args)
    {
        logic lobj = new logic();

        lobj.findSmallestDigit(8319425);;

    }
}

class logic
{
    void findSmallestDigit(int iNo)
    {
        int iDigit = 0, Min = iNo % 10;

        int temp = iNo;

        while(iNo != 0)
        {

            iDigit = iNo % 10;

            if(iDigit < Min)
            {
                Min = iDigit;
            }

            iNo = iNo / 10;
        }

        System.out.println("Smallest Digit in "+temp+" is : "+Min);
    }

}