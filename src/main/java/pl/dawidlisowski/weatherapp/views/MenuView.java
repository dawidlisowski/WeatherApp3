package pl.dawidlisowski.weatherapp.views;

import pl.dawidlisowski.weatherapp.models.dto.WeatherDto;

import java.util.Scanner;

public class MenuView {
    private Scanner scanner;

    public MenuView() {
        scanner = new Scanner(System.in);
    }

    public String getCity() {
        printString("Podaj nazwę miasta");
        return scanner.nextLine();
    }

    private void printString(String s) {
        System.out.println(s);
    }

    public void printWeather(WeatherDto weatherDto) {
        printString(weatherDto.getMainDto().getTemp() + "");
        printString(weatherDto.getMainDto().getPressure() + "");
    }
}
