// Input : 7
//Output : a    b   c   d   e   f   g

import java.util.*;

class program179
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        char Ch = 'a';

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print(Ch+"\t");
            Ch++;
          
        }

    }

    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the no. of Elements : ");
        int iValue = sobj.nextInt();

        Display(iValue);
            
    }
}