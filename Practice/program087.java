import java.util.*;

class program208
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
        int count = 0;

        for(i = 1, count = iRow; i <= iRow; i++,count--)
        {
            
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(count+"\t");

            }
            System.out.println();
        }

    }
}
/*
    iRow = 4
    iCol = 4

    4   4   4   4
    3   3   3   3
    2   2   2   2
    1   1   1   1

*/
