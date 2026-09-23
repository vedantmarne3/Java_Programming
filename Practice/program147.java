//String  Strinf to Camale Case
// Input : my name is vedant
// Output : My Name Is Vedant


// Input : my NAME is vedant
// Output : My Name Is Vedant


import java.util.Scanner;

class program741
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        str = str.trim();
        
        str = str.replaceAll("//s+"," ");

        str = str.toLowerCase();

        char Arr[] = str.toCharArray();


        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }

        System.out.println(str);

    }
}
// code sphape, hacker rank