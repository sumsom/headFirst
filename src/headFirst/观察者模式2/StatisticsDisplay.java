package headFirst.观察者模式2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float avgTemp;
	private float maxTemp;
	private float minTemp;
	private ArrayList tempList;
	Observable observable;

	public StatisticsDisplay(Observable observable) {
		tempList = new ArrayList();
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		// TODO �Զ����ɵķ������
		System.out.println("Avg/Max/Min temperature = " + avgTemp + "/" + maxTemp + "/" + minTemp);

	}

	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			tempList.add(weatherData.getTemperature());
			maxTemp = (float) Collections.max(tempList);
			minTemp = (float) Collections.min(tempList);
			avg();
			display();
		}

	}

	public float avg() {
		float total = 0;
		for (int i = 0; i < tempList.size(); i++) {
			total += (float) tempList.get(i);
		}
		avgTemp = total / tempList.size();
		return avgTemp;

	}

}
