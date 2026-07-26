class program02
{
    public static void main(String A[])
    {
        logic lobj = new logic();

        lobj.DisplayGrade(89);

    }
}

class logic
{
    void DisplayGrade(int iNo)
    {
       if(iNo >= 90)
       {
            System.out.println("O");
       }
       else if(iNo >= 80)
       {
            System.out.println("A+");
       }
       else if(iNo >= 70)
       {
            System.out.println("A");
       }
       else if(iNo >= 50)
       {
            System.out.println("B");
       }
       else if(iNo < 35)
       {
            System.out.println("Fail");
       }
       else
       {
            System.out.println("C");
       }
       
    }
}