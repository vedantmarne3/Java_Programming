import java.util.*;

class  program145
{
    public static void Update(int Arr[])    // Call by Refference
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt]++;
        }

        System.out.println("Array Elements After function call : ");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

    }
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;


       System.out.println("Enter the No. of Elements : ");
       int iLength = sobj.nextInt();

        int Brr[] = new int[iLength];

        System.out.println("Enter the Element : ");
        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

        System.out.println("Array Elements Before Function Call : ");
        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }

        Update(Brr);

        

        Brr = null;

        System.gc();
    }
}