//This code is for compile-time exception(FileNotFoundException)
import java.io.FileReader;
class RunException{
	public static void main(String[] args) throws java.io.FileNotFoundException{
		FileReader fr= new FileReader("Exception2.java");
		int[] arr={1,2,3};
		System.out.println(arr[3]);
		int a=5;
		int b=0;
		int result=a/b;
		System.out.println("Result is:"+result);
		System.out.println("End of public static void main");	
}
}
	