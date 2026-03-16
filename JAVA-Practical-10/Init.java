//Demonstrating init in Inheritance
class Identity{
	String name="Siddhant";	
	static int count=1;
	{	
		System.out.println(count);
		count++;
}
}
class Age extends Identity{
	public static void main(String[] args){
		Age identity=new Age();
		Age identity2=new Age();
		int age=19;
		System.out.println(identity.name);
		System.out.println(age);
	}
}
