import java.util.Scanner;
public class Diamond
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
		int size;
    	System.out.print("Enter size: ");
        size = sc.nextInt();
        int mid=size/2;
        if(size%2!=0)
        {
        for (int i=0;i<=mid;i++) 
        {
            for(int s=0;s<mid-i;s++)
                System.out.print(" ");
            for(int j=0;j<2*i+1;j++) 
            {
                if(j==0 || j==2*i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=mid-1;i>=0;i--) 
        {
            for(int s=0;s<mid-i;s++)
                System.out.print(" ");
            for (int j =0;j<2*i+1;j++) 
            {
                if(j==0 || j==2*i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        }
        else
        {
            System.out.println("Size is not odd");
        }
    }
}
