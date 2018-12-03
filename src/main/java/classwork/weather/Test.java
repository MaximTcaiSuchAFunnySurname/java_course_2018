package classwork.weather;

import classwork.util.FastScanner;

public class Test {

    public static void main(String[] args) {
        String city = new FastScanner().next();
        YahooWeather yahooWeather = new YahooWeather();
        String data = new Weather(yahooWeather).get(city);
        System.out.println(data);

    }

}
