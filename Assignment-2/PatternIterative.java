import java.util.Scanner;
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int mid=n/2;
        for (int i=0;i<n;i++) {
            int stars;
            if (i<=mid)
                stars=4*i+1;                 
            else
                stars=4*(n-i-1)+1;      
            int maxStars=(n%2== 0) ? 4*(mid-1)+1 : 4*mid+1;
            int spaces=(maxStars-stars)/2;
            System.out.println(" ".repeat(spaces) + "*".repeat(stars));
        }
        sc.close();
    }
}