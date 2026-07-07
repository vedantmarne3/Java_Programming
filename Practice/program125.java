import java.util.Scanner;

class program276
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String data = null;
        StringX strobj = new StringX();   // Errors
        int iRet = 0;

        System.out.println("Enter String : ");
        data = sobj.nextLine();

        iRet = strobj.CountCapital(data);

        System.out.println("Number of Capital characters : "+iRet);

        iRet = strobj.CountSmall(data);

        System.out.println("Number of Small characters : "+iRet);

        iRet = strobj.CountDigits(data);

        System.out.println("Number of Digts are : "+iRet);

        iRet = strobj.CountDigits(data);

        System.out.println("Number of WhiteSpaces are : "+iRet);

        iRet = strobj.CountSpecial(data);

        System.out.println("Number of Special Symbol are : "+iRet);


    }
}

