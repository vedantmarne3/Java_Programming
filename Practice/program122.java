import java.util.Scanner;

class program273
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String data = null;
        StringX strobj = new StringX();
        int iRet = 0;

        System.out.println("Enter String : ");
        data = sobj.nextLine();

        iRet = strobj.CountCapital(data);

        System.out.println("Number of Capital characters : "+iRet);

        iRet = strobj.CountSmall(data);

        System.out.println("Number of Small characters : "+iRet);

        iRet = strobj.CountDigits(data);

        System.out.println("Number of Digts are : "+iRet);



    }
}

class StringX
{
    public int CountCapital(String str)
    {
        int Count = 0, i = 0;

        char Arr[] = str.toCharArray(); //Sting to char array

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                Count++;
            }
        }
        return  Count;
    }

    public int CountSmall(String str)
    {
        int Count = 0;
        int i = 0;

        char Arr[] = str.toCharArray(); //Sting to char array

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Count++;
            }
        }
        return  Count;
    }

    public int CountDigits(String str)
    {
        int Count = 0;
        int i = 0;

        char Arr[] = str.toCharArray(); //Sting to char array

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= '0' && Arr[i] <= '9')
            {
                Count++;
            }
        }
        return  Count;
    }

}