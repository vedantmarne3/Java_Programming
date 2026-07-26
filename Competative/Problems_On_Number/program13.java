class program05
{
    public static void main(String[] args) 
    {
        logic lobj = new logic();

        lobj.CalculatePower(2, 5);

    }
}

class logic 
{
    void CalculatePower(int base, int exp)
    {
        int iCnt = 0, power = 1;

        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            power = power * base; 
        }

        System.out.println(power);
        
    }
}