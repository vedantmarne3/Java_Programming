
class program03
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.Maximum(9,14);
    }
}

class Logic
{

    void Maximum(int iNo1, int iNo2)
    {
        if(iNo1 >= iNo2)
        {
            System.out.println(iNo1+" Is Greater than "+iNo2);
        }
        else
        {
            System.out.println(iNo2+" Is Greater than "+iNo1);
        }


    }
}