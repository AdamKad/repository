
public class Person {
	
	private String name;
	private String lastname;
	private int age;
	
	public Person(String n, String ln, int a) {
		name=n;
		lastname=ln;
		age=a;
	}
	
	public String getName() {
		return name;
	}
	public String getLastname() {
		return lastname;
	}
	public int getAge() {
		return age;
	}
}
