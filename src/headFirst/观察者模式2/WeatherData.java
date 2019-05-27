package headFirst.观察者模式2;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	private boolean changed;
	
	public WeatherData() {
	}
	

	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
	}
	
	public float getTemperature() {
		return temperature;
		
	}
	
	public float gethumidity() {
		return humidity;
		
	}
	
	public float getPressure() {
		return pressure;
		
	}

}
