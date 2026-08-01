class program01
{
    public static void main(String A[])
    {
        logic lobj = new logic();

        lobj.productofDigit(234);

    }
}

class logic
{
    void productofDigit(int iNo)
    {
        int iDigit = 0, product = 1;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            product = product * iDigit;
            iNo = iNo / 10;
        }

        System.out.println("Product of Digit is : "+product);


    }
}