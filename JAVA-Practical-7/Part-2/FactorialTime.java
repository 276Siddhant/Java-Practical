class FT 
{
    static long f1_time=0,f2_time=0;
    public static void main(String[] args) 
    {
        FT calculator=new FT();
        int value= 15;
        int times=10_000_000;
		for(int i=0;i<times;i++)
		{
			long st=System.currentTimeMillis();
		    calculator.f1(value);
			long et=System.currentTimeMillis();
			f1_time+=et-st;
		}
        for(int i=0;i<times;i++)
		{
			long st=System.currentTimeMillis();
		    calculator.f2(value);
			long et=System.currentTimeMillis();
			f2_time+=et-st;
		}
        long avg_f1=f1_time/times;
		long avg_f2=f2_time/times;
		System.out.println(avg_f1);
		System.out.println(avg_f2);
    }
    public long f1(int n) 
    {
        if (n<0) return -1; 
        long result=1;
        for (int i=1;i<=n;i++) 
        {
            result*=i;
        }
        return result;
    }
    public long f2(int n) 
    {
        if (n<0) return -1;
        if (n==0 || n==1) 
        {
            return 1;
        }
        return n*f2(n-1);
    }
}