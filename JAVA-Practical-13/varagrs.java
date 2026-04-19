class Varargs{
    static void printNumbers(int... nums){
        for (int n:nums){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args){
        printNumbers(10,20,30);
        printNumbers(5);
        printNumbers();
    }
}