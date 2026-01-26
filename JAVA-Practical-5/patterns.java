import java.util.Scanner;
class Pattern1
{
     public static void main(String args[])
  	{
		Scanner sc=new Scanner(System.in);
		int size;
    	System.out.print("Enter size: ");
        size = sc.nextInt();
    	int ws=2*size-3;
    	for(int i=0;i<size;i++)
   		{
       		if(i==size-1)
       		{
           		int j=2*size-1;
            	while(j>0)
            	{
                	System.out.print("*");
               		j--;
           		}
        	}
       		else
       		{
       			for(int j=0;j<=i;j++)
       		    {
          		 	System.out.print("*");
        		}
        		for(int j=0;j<ws;j++)
        		{
            		System.out.print(" ");
        		}
        		for(int j=0;j<=i;j++)
       			{
           			System.out.print("*");
        		}
    		}
        	ws=ws-2;
       		System.out.println();
   	    }
    }
}
class Pattern2
{
	public static void main(String args[])
  	{
		Scanner sc=new Scanner(System.in);
		int size;
    	System.out.print("Enter size: ");
        size = sc.nextInt();
		for(int i=0;i<size;i++)
        {
        	int count=size;
         	for(int j=0;j<i;j++)
         	{
            	System.out.print(" ");
         	}
         	while(count!=0)
         	{
            	System.out.print("*");
            	count--;
         	}
         System.out.println();
    	}
	}
}
class Pattern3
{
	public static void main(String args[])
  	{
		Scanner sc=new Scanner(System.in);
		int size;
    	System.out.print("Enter size: ");
        size = sc.nextInt();
		for(int i=0;i<size;i++)
    	{
        	int count=i+1;
        	for(int j=0;j<size-i-1;j++)
        	{
            	System.out.print(" ");
        	}
        	while(count!=0)
        	{
            	System.out.print("+ ");
            	count--;
        	}
        	System.out.println();
    	}
    	for(int i=size-1;i>=0;i--)
    	{
        	int cnt=i;
        	for(int j=1;j<=size-i;j++)
        	{
            	System.out.print(" ");
        	}
        	while(cnt!=0)
        	{
            	System.out.print("+ ");
            	cnt--;
        	}
        System.out.println();
    	}
	}
}
class Pattern4
{
	public static void main(String args[])
  	{
		Scanner sc=new Scanner(System.in);
		int size;
    	System.out.print("Enter size: ");
        size = sc.nextInt();
		int a=1;
    	for(int i=0;i<size;i++)
    	{
        	for(int j=0;j<=i;j++)
        	{
            	System.out.print(a);
				System.out.print(" ");
            	a++;
        	}
        	System.out.println();
    	}
	}
}
class Pattern5
{
	public static void main(String args[])
  	{
		Scanner sc=new Scanner(System.in);
		int size;
    	System.out.print("Enter size: ");
        size = sc.nextInt();
		for(int i=0;i<size;i++)
    	{
        	int count=i+1;
        	int k=i+1;
        	for(int j=0;j<size-i-1;j++)
        	{
            	System.out.print(" ");
        	}
        	while(count!=0)
        	{
            	System.out.print(k);
				System.out.print(" ");
            	k++;
            	count--;
        	}
        	System.out.println();
    	}
    	for(int i=size-1;i>=0;i--)
    	{
        	int cnt=i;
        	int a=i;
        	for(int j=1;j<=size-i;j++)
        	{
        	    System.out.print(" ");
        	}
        	while(cnt!=0)
        	{
            	System.out.print(a);
				System.out.print(" ");
            	a++;
            	cnt--;
        	}
        	System.out.println();
    	}
	}
}
