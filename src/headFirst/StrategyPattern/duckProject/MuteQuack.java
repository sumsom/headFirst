package headFirst.StrategyPattern.duckProject;

public class MuteQuack implements QuackBehavior {

	@Override
	public String quack() {
		// TODO �Զ����ɵķ������
		System.out.println("<< Slience >>");
		return "<< Slience >>";

	}

}
