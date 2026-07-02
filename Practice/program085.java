

import java.util.*;


class program206
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

        for(i = 1; i <= iRow; i++)
        {
            
            for(j = 1, ch = 'a'; j <= iCol; j++,ch++)
            {
                if(i % 2 == 0)
                {
                    System.out.print(j+"\t");
                }
                else{
                    System.out.print(ch+"\t");
                }
                

            }
            System.out.println();
        }

    }
}
/*
    iRow = 4
    iCol = 4

    a   b   c   d
    1   2   3   4
    a   b   c   d
    1   2   3   4

*/
