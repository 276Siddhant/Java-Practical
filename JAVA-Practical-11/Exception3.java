//This code is for try-catch exception handling
import java.io.FileReader;
import java.io.FileNotFoundException;
class RunException{
	public static void main(String[] args){
		FileReader fr=null;
		try{
			fr= new FileReader("Sample.java");
}
		catch(FileNotFoundException fnf){
			System.out.println("FileNotFoundException");
}
		System.out.println(fr);
		try{
			int[] arr={1,2,3};
			System.out.println(arr[3]);
}
		catch(ArrayIndexOutOfBoundsException aiob){
			System.out.println("ArrayIndexOutofBounds");
}
		try{
			int a=5;
			int b=0;
			int result=a/b;
			System.out.println("Result is:"+result);
}
		catch(ArithmeticException ae){
			System.out.println("Division by zero error");
}
		System.out.println("End of public static void main");	
}
}
	