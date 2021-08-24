package denemelerim;

public class Student {
	static String name = "Emily";
	int age = 20;

	public Student(String name, int age) {

		this.name = name;
		this.age = 22;
	}

	public static void main(String[] args) {

		Student st = new Student("Oliver", 21);

		System.out.print(st.name);
		System.out.print("," + st.age);
	}

}
