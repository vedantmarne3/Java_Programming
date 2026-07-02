/*
    iRow = 4
    iCol = 4

    1   2   3   4
    1   2   3   4
    1   2   3   4
    1   2   3   4
*/

import java.util.*;


class program199
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

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }



    }
}

