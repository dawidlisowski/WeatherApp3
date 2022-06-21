package pl.dawidlisowski.weatherapp.controllers;

import pl.dawidlisowski.weatherapp.models.LoadWeatherService;
import pl.dawidlisowski.weatherapp.models.dto.WeatherDto;
import pl.dawidlisowski.weatherapp.views.MenuView;

public class MainController {
    private MenuView menuView;
    private LoadWeatherService loadWeatherService;

    public MainController() {
        menuView = new MenuView();
        loadWeatherService = new LoadWeatherService();
    }

    public void startApp() {
        do {
            getWeather(menuView.getCity());
        } while (true);
    }

    private void getWeather(String city) {
        WeatherDto weatherDto = loadWeatherService.loadWeatherFor(city);
        menuView.printWeather(weatherDto);
    }
}
