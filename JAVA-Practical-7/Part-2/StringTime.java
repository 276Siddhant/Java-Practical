class FT 
{
    static long f1_time=0,f2_time=0;
    public static void main(String[] args) 
    {
        FT calculator=new FT();
        String str1="abababa";
        String str2="aba";
        int times = 1000000; 
        long totalMatches=0;
        long st1=System.currentTimeMillis();
        for(int i=0;i<times;i++) 
        {
            totalMatches+=calculator.f1(str1,str2);
        }
        long et1=System.currentTimeMillis();
        f1_time=et1-st1;
        long st2=System.currentTimeMillis();
        for (int i=0;i<times;i++) {
            totalMatches+=calculator.f2(str1,str2);
        }
        long et2=System.currentTimeMillis();
        f2_time=et2-st2;
        System.out.println("Total Iterative Time (f1): "+ f1_time +" ms");
        System.out.println("Total Recursive Time (f2): "+f2_time+" ms");
        System.out.println("Total matches found: "+totalMatches);
    }
    public int f1(String str1,String str2) 
    {
        int count=0;
        int n=str1.length();
        int m=str2.length();
        for(int i=0;i<=n-m;i++) 
        {
            boolean match=true;
            for (int j=0;j<m;j++) 
            {
                if(str1.charAt(i+j)!=str2.charAt(j)) 
                {
                    match=false;
                    break;
                }
            }
            if(match) count++;
        }
        return count;
    }
    public int f2(String str1, String str2) 
    {
        if(str1.length()<str2.length()) return 0;
        int match=str1.substring(0,str2.length()).equals(str2) ? 1 : 0;
        return match + f2(str1.substring(1), str2);
    }
}