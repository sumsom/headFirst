package headFirst.StrategyPattern.duckProject;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public Duck() {
	}
	public abstract void dispay();
	public void performFly() {
		flyBehavior.fly();
	}
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior=qb;
	}
	
	public void swim() {
		System.out.println("所有鸭子都会游泳！");
	}

}
