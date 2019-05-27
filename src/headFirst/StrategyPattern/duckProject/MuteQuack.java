package headFirst.StrategyPattern.duckProject;

public class MuteQuack implements QuackBehavior {

	@Override
	public String quack() {
		// TODO 自动生成的方法存根
		System.out.println("<< Slience >>");
		return "<< Slience >>";

	}

}
