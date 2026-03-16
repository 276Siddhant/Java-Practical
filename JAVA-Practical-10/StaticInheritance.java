//Demonstrating Static Inheritance
class Identity{
	static String name="Siddhant";	
	static{
		System.out.println("Name is:"+name);
}
}
class Age extends Identity{
	public static void main(String[] args){
		Age identity=new Age();
		int age=19;
		System.out.println(identity.name);
		System.out.println(age);
	}
}
