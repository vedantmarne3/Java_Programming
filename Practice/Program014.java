import java.util.Scanner;


class program47
{
    public static void main(String A[])
    {
    Scanner sobj = new Scanner(System.in);

    int iValue = 0;
    

    System.out.println("Enter number : ");
    iValue = sobj.nextInt();

    NumberX nobj = new NumberX();

    nobj.DislayFactors(iValue);

    }
       
}

class NumberX 
{
    public void DislayFactors(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
   
}
//Time Complexity : O(N/2)  order By N by 2
// Where N >= 0