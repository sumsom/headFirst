package headFirst.StrategyPattern.duckProject;

public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehavior =new Quack();
		flyBehavior =new FlyWithWings();
	}

	@Override
	public void dispay() {
		// TODO 自动生成的方法存根
		System.out.println("我是一只真正的绿头鸭！我的叫声是："+quackBehavior.quack());

	}

}
