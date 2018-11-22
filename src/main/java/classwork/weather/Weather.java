package classwork.weather;

public class Weather {
    WeatherInterface weatherClass;

    public Weather(WeatherInterface weatherClass) {
        this.weatherClass = weatherClass;
    }

    public String get(String city){
       return weatherClass.getWeather(city);
    }
}
