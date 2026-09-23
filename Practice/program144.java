
import java.util.Scanner;

//String


class program738
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("//s+"," ");

        String tokens[] = str.split(" ");

        System.out.println("Numbers of words : "+tokens.length);

        int imax = tokens[0].length();
        String temp = null;

        for(int i = 0; i < tokens.length; i++)
        {
            if(tokens[i].length() >= imax)
            {
                imax = tokens[i].length();
                temp = tokens[i];

            }
            
        }
        System.out.println("All words with maximum legnth : ");

        for(int i = 0; i < tokens.length; i++)
        {
            if(tokens[i].length() == imax)
            {
                System.out.println(tokens[i]);
            }
        }
    }
}
// code sphape, hacker rank