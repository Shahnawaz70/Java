
public abstract class Person {
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public abstract void getRoleInfo();
	
	public void getDeatils() {
		System.out.println("Name " + name + " Age " + age);
	}	
}
