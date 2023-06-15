package common;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import java.io.IOException;

import static org.junit.Assert.assertTrue;
public class APIs {

    public static void getMethodPosts() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        Request request = new Request.Builder()
                .url("https://jsonplaceholder.typicode.com/posts")
                .method("GET", null)
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response);
        assertTrue(response.isSuccessful());
    }

    public static void postMethodCreatePost() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\r\n\r\n\"userId\": 11,\r\n\"id\": 104,\r\n\"title\": \"yes another title in latin\",\r\n\"body\": \"bla mug cola perfume bla bla text in latin\"\r\n\r\n\r\n}");
        Request request = new Request.Builder()
                .url("https://jsonplaceholder.typicode.com/posts")
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response);
        assertTrue(response.isSuccessful());
    }

    //exercise on the Weather API from Thursday, 11.5

    public static void getWeather16daysBari() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://weatherbit-v1-mashape.p.rapidapi.com/forecast/daily?lat=41.11&lon=16.87&units=metric&lang=uk")
                .get()
                .addHeader("X-RapidAPI-Key", "95f7691456mshf36f27c6761fe7bp1409a6jsnea772acbd6e5")
                .addHeader("X-RapidAPI-Host", "weatherbit-v1-mashape.p.rapidapi.com")
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
        assertTrue(response.isSuccessful());
    }

    public static void getWeather120hoursFlorence() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://weatherbit-v1-mashape.p.rapidapi.com/forecast/hourly?lat=43.77&lon=11.23&lang=en&hours=120&units=metric")
                .get()
                .addHeader("X-RapidAPI-Key", "95f7691456mshf36f27c6761fe7bp1409a6jsnea772acbd6e5")
                .addHeader("X-RapidAPI-Host", "weatherbit-v1-mashape.p.rapidapi.com")
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
        assertTrue(response.isSuccessful());
    }

    public static void getCurrentWeatherRome() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://weatherbit-v1-mashape.p.rapidapi.com/current?lon=12.52&lat=41.91&units=metric&lang=it")
                .get()
                .addHeader("X-RapidAPI-Key", "95f7691456mshf36f27c6761fe7bp1409a6jsnea772acbd6e5")
                .addHeader("X-RapidAPI-Host", "weatherbit-v1-mashape.p.rapidapi.com")
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
        assertTrue(response.isSuccessful());
    }

    public static void getOneHourMinutelyForecastCefalu() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://weatherbit-v1-mashape.p.rapidapi.com/forecast/minutely?lat=38.03&lon=14.01&units=metric")
                .get()
                .addHeader("X-RapidAPI-Key", "95f7691456mshf36f27c6761fe7bp1409a6jsnea772acbd6e5")
                .addHeader("X-RapidAPI-Host", "weatherbit-v1-mashape.p.rapidapi.com")
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
        assertTrue(response.isSuccessful());
    }

    public static void getSevereWeatherAlertsDublin() throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://weatherbit-v1-mashape.p.rapidapi.com/alerts?lat=53.34&lon=-6.25")
                .get()
                .addHeader("X-RapidAPI-Key", "95f7691456mshf36f27c6761fe7bp1409a6jsnea772acbd6e5")
                .addHeader("X-RapidAPI-Host", "weatherbit-v1-mashape.p.rapidapi.com")
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
        assertTrue(response.isSuccessful());
    }

    public static void get5daysForecastBirmingham() throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://weatherbit-v1-mashape.p.rapidapi.com/forecast/3hourly?lat=52.48&lon=-1.89&units=metric&lang=en")
                .get()
                .addHeader("X-RapidAPI-Key", "95f7691456mshf36f27c6761fe7bp1409a6jsnea772acbd6e5")
                .addHeader("X-RapidAPI-Host", "weatherbit-v1-mashape.p.rapidapi.com")
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
        assertTrue(response.isSuccessful());
    }

    public static void getCurrentWeatherInverness() throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://weatherbit-v1-mashape.p.rapidapi.com/current?lon=-4.22&lat=57.47&units=metric&lang=uk")
                .get()
                .addHeader("X-RapidAPI-Key", "95f7691456mshf36f27c6761fe7bp1409a6jsnea772acbd6e5")
                .addHeader("X-RapidAPI-Host", "weatherbit-v1-mashape.p.rapidapi.com")
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
        assertTrue(response.isSuccessful());
    }
    public static void main(String[] args) throws IOException {
        //getMethodPosts();
        //postMethodCreatePost();
        getWeather16daysBari();
        getWeather120hoursFlorence();
        getCurrentWeatherRome();
        getOneHourMinutelyForecastCefalu();
        getSevereWeatherAlertsDublin();
        get5daysForecastBirmingham();
        getCurrentWeatherInverness();
    }
}
