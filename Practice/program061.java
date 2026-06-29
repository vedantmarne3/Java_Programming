// Input : 7
//Output : a    b   c   d   e   f   g

//A => 65 ascii value
//a => 97
//0 => 48

import java.util.*;

class program182
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        char ch = '\0';

        for(iCnt = 1,ch = 65; iCnt <= iNo; iCnt++, ch++)
        {
            System.out.print(ch+"\t");
               
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