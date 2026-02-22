class FactorialIteration
{
    public static void main(String[] args)
    {
    int number=5;
    long fact=1;
    for(int i=1;i<=number;i++)
    {
        fact=fact*i;
    }
    System.out.println(fact);
    }
}
class FactorialRecursion
{
    public static void main(String[] args)
    {
        int number=5;
        long result=factorialRecursion(number);
        System.out.println(result);
    }
    static long factorialRecursion(int n)
    {
        if(n<0)  return -1; // -1 here indicates factorial of negative number not possible
        if(n==0 || n==1) return 1;
        return n*factorialRecursion(n-1);
    }
}