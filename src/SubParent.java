
public class SubParent extends Parent {
	SubParent() {
		System.out.println("调用子类的SubParent()构造方法");
	}

	public int add(int a, int b) {
		int c = a + b;
		return c;

	}
	
	public void test() {
		System.out.println("test");
	}
	
}
