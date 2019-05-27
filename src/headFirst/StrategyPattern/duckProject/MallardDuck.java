package headFirst.StrategyPattern.duckProject;

public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehavior =new Quack();
		flyBehavior =new FlyWithWings();
	}

	@Override
	public void dispay() {
		// TODO �Զ����ɵķ������
		System.out.println("����һֻ��������ͷѼ���ҵĽ����ǣ�"+quackBehavior.quack());

	}

}
