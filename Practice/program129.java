package Marvellous;

//creat coustom library

public class StringX
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

    public int CountSpace(String str)
    {
        int Count = 0;
        int i = 0;

        char Arr[] = str.toCharArray(); //Sting to char array

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ' ')
            {
                Count++;
            }
        }
        return  Count;
    }

    public int CountSpecial(String str)
    {
        int Count = 0;
        int i = 0;

        char Arr[] = str.toCharArray(); //Sting to char array

        for(i = 0; i < Arr.length; i++)
        {
            if((Arr[i] >= '!' && Arr[i] <= '/') || 
               (Arr[i] >= ':' && Arr[i] <= '@') ||
               (Arr[i] >= '[' && Arr[i] <= '`') ||
               (Arr[i] >= '{' && Arr[i] <= '~'))
            {
                Count++;
            }
        }
        return  Count;
    }

}