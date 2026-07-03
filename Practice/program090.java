import java.util.*;

class program211
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

        if(iRow != iCol)
        {
            System.out.println("Invalid parameter");
            System.out.println("NUmber of rows and columns should be same");
            return;
        }

        for(i = 1; i <= iRow; i++)
        {
            
            for(j = 1; j <= iCol; j++)
            {
                if(i == j)  // Diagonal
                {
                    System.out.print("$\t");
                }
                else
                {
                    System.out.print("@\t");
                }
            }
            System.out.println();
        }

    }
}
/*
    iRow = 4
    iCol = 4

    $   @   @   @
    @   $   @   @
    @   @   $   @
    @   @   @   $

*/
