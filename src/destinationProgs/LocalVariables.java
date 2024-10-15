package destinationProgs;

public class LocalVariables {

	public static void main(String[] args) {
		Dogy d = new Dogy();
		int ageValue=d.add(10, "zoozu");
		System.out.println(ageValue);

	}

}
class Dogy{
	public int add(int age,String name) {
			return age;
	}
	
}