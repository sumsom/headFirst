
public class Subroutine extends SubParent {
	private int a=5;
	private int b=6;

	Subroutine() {
		super();
		super.test();
		int c=super.add(a, b);
		System.out.println("���������Subroutine()���췽��");
		System.out.println(a+"+"+b+"="+c);
	}
	
	public static void main(String[] args) {		
		Subroutine s = new Subroutine(); // ʵ�����������
	}
}
