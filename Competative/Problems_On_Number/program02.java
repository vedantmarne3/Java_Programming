
class program04
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.findMinimum(11, 31, 2);
    }
}

class Logic
{

    void findMinimum(int iNo1, int iNo2, int iNo3)
    {
        int iMin = 0;

        if(iNo1 <= iNo2 && iNo1 <= iNo3)
        {
            System.out.println(iNo1);
        }
        else if(iNo2 <= iNo1 && iNo2 <= iNo3)
        {
            System.out.println(iNo2);
        }
        else
        {
            System.out.println(iNo3);
        }

    }
}