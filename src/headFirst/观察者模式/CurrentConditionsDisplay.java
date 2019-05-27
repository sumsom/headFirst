package headFirst.观察者模式;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		// TODO �Զ����ɵķ������
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");

	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO �Զ����ɵķ������
		this.temperature = temp;
		this.humidity = humidity;
		display();

	}

}
