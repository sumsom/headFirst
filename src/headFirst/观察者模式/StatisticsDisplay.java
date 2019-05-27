package headFirst.观察者模式;

import java.util.ArrayList;
import java.util.Collections;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float avgTemp;
	private float maxTemp;
	private float minTemp;
	private ArrayList tempList;
	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData) {
		tempList=new ArrayList();
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		// TODO �Զ����ɵķ������
		System.out.println("Avg/Max/Min temperature = " + avgTemp + "/"+maxTemp+"/"+minTemp);

	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO �Զ����ɵķ������
		tempList.add(temp);
		maxTemp=(float) Collections.max(tempList);
		minTemp=(float) Collections.min(tempList);
		avg();
		display();

	}
	
	public float avg() {
		float total=0;
		for(int i=0;i<tempList.size();i++) {
			total +=(float)tempList.get(i);
		}
		avgTemp=total/tempList.size();
		return avgTemp;
		
	}

}
