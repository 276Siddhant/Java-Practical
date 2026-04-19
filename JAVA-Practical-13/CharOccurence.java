class Example{
	static int count=0;
	public static void main(String[] args){
			for(int i=0;i<args[1].length;i++){
				if(s[i]==args[0]){
					count++;
				}		
			}
			System.out.println("Occurence of "+args[0]+"is: "+count);
	}
}