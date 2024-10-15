package destinationProgs;

public class StaticVaribles {

	public static void main(String[] args) {
		Main m = new Main();
		m.display();
		m.addDatas(30, "browny");
		m.display();

	}

}
class Main{
	static int age;
	static String name;
	public void addDatas(int age,String name) {
		this.age=age;
		this.name=name;		
	}
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println("==========");
	}
}