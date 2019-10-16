/* 
 * @author Nolan
 * @version 1
 * @
 */
public class Giraffe {
	
	int height = 40;
	int age = 9;
	String name = "Johnny";
	
	public int getHeight() {
		return height;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void walk(int steps) {
		System.out.println(this.name + " is walking " + steps + " steps");
	}

	public static void main(String[] args) {
		Giraffe giraffe = new Giraffe();
		giraffe.setHeight(50);
		giraffe.setAge(12);
		giraffe.setName("Geoffrey");
		System.out.println(giraffe.getHeight());
		System.out.println(giraffe.getAge());
		System.out.println(giraffe.getName());
		giraffe.walk(3);
	}

}
