package headFirst.观察者模式2;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		WeatherData weatherData=new WeatherData();
		CurrentConditionsDisplay CurrentConditions=new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay Statistics=new StatisticsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		

	}

}
