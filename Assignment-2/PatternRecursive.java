import java.util.Scanner;
class StarPatternRecursive {
    static int n,mid,maxStars;
    static void print(int i) {
        if (i==n) return;
        int stars;
        if (i<=mid)
            stars=4*i+1;
        else
            stars=4*(n-i-1)+1;
        int spaces=(maxStars-stars)/2;
        System.out.println(" ".repeat(spaces) + "*".repeat(stars));
        print(i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        n=sc.nextInt();
        mid=n/2;
        maxStars=(n%2==0) ? 4*(mid-1)+1 : 4*mid+1;
        print(0);
        sc.close();
    }
}