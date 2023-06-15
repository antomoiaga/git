package apiStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class StepDefs {
    @Given("that I will get the weather for 16 days for Bari")
    public void thatIwillGetTheWeatherFor16daysForBari() throws IOException {
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

    @Then("I will get the weather for 120 hours for Florence")
    public void iWillGetTheWeatherFor120hoursForFlorence() throws IOException {
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

    @Then("I will get the current weather for Rome")
    public void iWillGetTheCurrentWeatherForRome() throws IOException {
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

    @Then("I will get one hour minutely forecast for Cefalu")
    public void iWillGetOneHourMinutelyForecastForCefalu() throws IOException {
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

    @Then("I will get severe weather alerts for Dublin")
    public void iWillGetSevereWeatherAlertsForDublin() throws IOException {
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

    @Then("I will get 5 days forecast for Birmingham")
    public void iWillGet5DaysForecastForBirmingham() throws IOException {
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


}
