import java.util.*;

class program170
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the no. of Element : ");
        int iLength = sobj.nextInt();

        ArrayX aobj = new ArrayX(iLength);

        aobj.Accept();
        aobj.Display();

        int iRet = aobj.Summation();

        System.out.println("Summation is : "+iRet);
        
    }

}

class ArrayX
{
    Scanner sobj = new Scanner(System.in);

    private int iSize;
    private int Arr[];

    ArrayX(int x)
    {
        this.iSize = x;                  
        this.Arr = new int[iSize];
    }
    void Accept()
    {
        int iCnt = 0;
        
        System.out.println("Enter the element : ");
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            this.Arr[iCnt] = sobj.nextInt();
        }
    }

    void Display()
    {
        int iCnt = 0;
        System.out.println("Elements of the Array are : ");
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println(this.Arr[iCnt]);
        }
    }

    int Summation()
    {
        int iSum = 0, iCnt = 0;

        for(iCnt= 0; iCnt < iSize; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }

        return iSum;
    }
}