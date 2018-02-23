//Sagnik Project
class Main
{
    static int factorial(int n)
    {
        int fact = 1;
        while (n != 0)
        {
            fact = fact*n;
            n--;
        }
        return fact;
    }
   
    static boolean isMain(int n)
    {
        int sum = 0;
 
        int temp = n;
        while (temp != 0)
        {   
            sum += factorial(temp%10); // Modifications made for Requirement ID: 8 
 
            
            temp = temp/10;
        }
 
        
        return (sum == n);
    }

    public static void main(String[] args)
    {
        int n = 145;
        if (isMain(n))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}