class StringIteration
{
    public static void main(String[] args)
    {
        int count = 0;
        String str1="abababa";
        String str2="aba";
        int n=str1.length();
        int m=str2.length();
        for(int i=0;i<=n-m;i++) 
        {
            boolean match=true;
            for(int j=0;j<m;j++) 
            {
                if(str1.charAt(i+j)!=str2.charAt(j)) 
                {
                match=false;
                break;
                }
            }
            if(match)
            count++;
        }
        System.out.println(count);
    }
}
class StringRecursion
{
    public static void main(String[] args)
    {
        String str1="abababa";
        String str2="aba";
        int count=countOccurrences(str1,str2);
        System.out.println(count);
    }
    static int countOccurrences(String str1,String str2) 
    {
        if(str1.length()<str2.length())  return 0;
        if(str1.substring(0,str2.length()).equals(str2))   return 1+countOccurrences(str1.substring(1),str2);
        else return countOccurrences(str1.substring(1), str2);
    }
}