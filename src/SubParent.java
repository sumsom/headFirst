
public class SubParent extends Parent {
	SubParent() {
		System.out.println("���������SubParent()���췽��");
	}

	public int add(int a, int b) {
		int c = a + b;
		return c;

	}
	
	public void test() {
		System.out.println("test");
	}
	
}
