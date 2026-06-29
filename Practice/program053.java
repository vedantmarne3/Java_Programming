// Input : 5
//Output : *    #   *   #   *   #   *   #   *   #

import java.util.*;

class program174
{
    public static void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("*"+"\t"+"#"+"\t");
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