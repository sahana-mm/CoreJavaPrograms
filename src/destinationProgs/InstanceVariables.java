package destinationProgs;

public class InstanceVariables {

	public static void main(String[] args) {
         Dog d = new Dog();
         d.display();
         d.addData("kariya", 20, "rotwheeler", 20000, "creem");
         d.display();

	}

}
class Dog{
	String name;
	int age;
	String breed;
	int cost;
	String color;
	public void  addData(String name, int age, String breed, int cost, String color) {
		this.name=name;
		this.age=age;
		this.breed=breed;
		this.cost=cost;
		this.color=color;
	}
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(breed);
		System.out.println(cost);
		System.out.println(color);
		System.out.println("===================");
	}
}