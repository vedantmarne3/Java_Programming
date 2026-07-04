import java.util.*;

class program227
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0, iValue2;

        Pattern pobj = new Pattern();

        System.out.println("Enter no. of Rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter no. of Column : ");
        iValue2 = sobj.nextInt();


        pobj.Display(iValue1, iValue2);

    }
}

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = '\0';


        for(i = 1,ch = 'a'; i <= iRow; i++)
        {
            
            for(j = 1; j <= i; j++)
            {

                System.out.print(ch+"\t");
                ch++;
                
            }
            System.out.println();
        }

    }
}
/*
    iRow = 4
    iCol = 4

    a
    bc
    def
    ghij


*/
