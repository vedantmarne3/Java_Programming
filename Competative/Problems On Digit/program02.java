
class program02
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.CheckPalindrome(121);
    }
}

class Logic
{

    void CheckPalindrome(int num)
    {
        int iDigit = 0, iRev = 0;
        int temp = num;

        while(num != 0)
        {
            iDigit = num % 10;
            iRev = (iRev * 10) + iDigit;
            num = num / 10;
        }

        if(iRev == temp)
        {
            System.out.println("Number is Palindrome!!");
        }
        else
        {
            System.out.println("Number is not Palindrome!!");
        }


    }
}