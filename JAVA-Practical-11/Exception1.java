//This code is for run-time exception(ArrayIndexOutOfBounds)
class RunException{
	public static void main(String[] args){
		int[] arr={1,2,3};
		System.out.println(arr[3]);
		int a=5;
		int b=0;
		int result=a/b;
		System.out.println("Result is:"+result);
		System.out.println("End of public static void main");	
}
}
	