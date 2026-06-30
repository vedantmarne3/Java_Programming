// Input : 7
//Output : A    b   C   d   E   f   G   
//         1    2   3   4   5   6   7


import java.util.*;

class program187
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        char ch1 = '\0';
        char ch2 = '\0';


        for(iCnt = 1,ch1 = 'A', ch2 ='a'; iCnt <= iNo; iCnt++,ch2++,ch1++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.print(ch2+"\t");
                
            }
            else
            {
                System.out.print(ch1+"\t");
                
            }
            
               
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