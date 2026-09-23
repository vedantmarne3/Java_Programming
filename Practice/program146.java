//String  Strinf to Camale Case
// Input : my name is vedant
// Output : My Name Is Vedant


// Input : my NAME is vedant
// Output : My Name Is Vedant


import java.util.Scanner;

class program740
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        str = str.trim();
        
        str = str.replaceAll("//s+"," ");

        str = str.toLowerCase();

        System.out.println(str);

    }
}
// code sphape, hacker rank