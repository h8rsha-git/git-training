package core_java;

@FunctionalInterface
public interface InterEmp {
	void show(int newId);
	//void show();
	default void helloAll() {
		System.out.println("Hello Employees");
	}
	static void byeAll() {
		System.out.println("Bye Employees");
	}
}
