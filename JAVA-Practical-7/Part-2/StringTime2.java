class FT
 {
    static long f1_time=0,f2_time=0;
    public static void main(String[] args) 
    {
        FT calculator=new FT();
        String str1="abababa";
        String str2="aba";
        int times=1_000_000; 
        long totalMatches=0;
        long st1=System.currentTimeMillis();
        for (int i=0;i<times;i++)
         {
            totalMatches+=calculator.f1(str1, str2);
        }
        long et1=System.currentTimeMillis();
        f1_time=et1-st1;
        long st2=System.currentTimeMillis();
        for(int i=0;i<times;i++)
         {
            totalMatches+=calculator.f2(str1,str2,0);
        }
        long et2=System.currentTimeMillis();
        f2_time=et2-st2;
        System.out.println("Total f1 (Iterative) Time: "+f1_time+" ms");
        System.out.println("Total f2 (Recursive) Time: "+f2_time+" ms");
        System.out.println("Check Sum (Matches): "+totalMatches);
    }
    public int f1(String str1,String str2) 
    {
        int count=0;
        int n=str1.length();
        int m=str2.length();
        for(int i=0;i<=n-m;i++) 
        {
            if(str1.regionMatches(i,str2,0,m)) 
            {
                count++;
            }
        }
        return count;
    }
    public int f2(String str1,String str2,int start) 
    {
        if(start>str1.length()-str2.length()) 
        {
            return 0;
        }
        int match=str1.regionMatches(start,str2,0,str2.length()) ? 1 : 0;
        return match+f2(str1,str2,start+1);
    }
}