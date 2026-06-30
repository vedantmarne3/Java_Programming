// Input : 7
//Output : A    *   C   *   E   *   F



import java.util.*;

class program185
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        char ch = '\0';

        for(iCnt = 1,ch = 'A'; iCnt <= iNo; iCnt++, ch++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.print(ch+"\t");
            }
            else
            {
                System.out.print("*\t");
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