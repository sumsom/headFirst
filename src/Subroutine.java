
public class Subroutine extends SubParent {
	private int a=5;
	private int b=6;

	Subroutine() {
		super();
		super.test();
		int c=super.add(a, b);
		System.out.println("调用子类的Subroutine()构造方法");
		System.out.println(a+"+"+b+"="+c);
	}
	
	public static void main(String[] args) {		
		Subroutine s = new Subroutine(); // 实例化子类对象
	}
}
