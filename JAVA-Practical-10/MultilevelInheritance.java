// Demonstrating Multilevel Inheritance

class Identity{
	String name="Siddhant";
}
class Nationality extends Identity{
	String country="Indian";
}
class Age extends Nationality{
	public static void main(String[] args){
        	Age identity=new Age();
        	int age=19;
        	System.out.println("Name:"+identity.name);
        	System.out.println("Nationality:"+identity.country);
        	System.out.println("Age:"+age);
    }
}