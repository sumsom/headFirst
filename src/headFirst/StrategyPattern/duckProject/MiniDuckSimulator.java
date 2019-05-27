package headFirst.StrategyPattern.duckProject;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Duck mallard=new MallardDuck();
		mallard.performFly();
		//mallard.performQuack();
		mallard.setQuackBehavior(new Squeak());
		mallard.dispay();
		mallard.swim();

	}

}
