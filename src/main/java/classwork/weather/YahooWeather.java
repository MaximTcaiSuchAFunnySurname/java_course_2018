package classwork.weather;

import org.json.JSONArray;
import org.json.JSONObject;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class YahooWeather implements WeatherInterface {
    public String getWeather(String city) {
        try {
            URL url = new URL("https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22" + city + "%22)%20and%20u%3D%22c%22&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys");
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("GET");
                System.out.println(httpURLConnection.getResponseCode());
                BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while((inputLine=in.readLine())!=null){
                    content.append(inputLine);
                }
                in.close();
                httpURLConnection.disconnect();
                JSONObject data = new JSONObject(content.toString());
                JSONObject query = (JSONObject)data.get("query");
                JSONObject result = (JSONObject)query.get("results");
                JSONObject channel = (JSONObject)result.get("channel");
                JSONObject item = (JSONObject)channel.get("item");
                JSONArray forecast = (JSONArray)item.get("forecast");
                StringBuffer outData = new StringBuffer();
                for (int i = 0; i<forecast.length(); i++){
                    outData.append(forecast.get(i)+"\n");
                }
                return outData.toString();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "ERROR";
    }
}
