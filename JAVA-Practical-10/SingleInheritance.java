//Demonstrating Single Inheritance
class Identity{
	String name="Siddhant";	
}
class Nationality{
	String nationality="Indian";
	Nationality(){
		System.out.println(nationality);
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
