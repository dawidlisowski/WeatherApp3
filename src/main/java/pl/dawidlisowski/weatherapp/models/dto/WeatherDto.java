package pl.dawidlisowski.weatherapp.models.dto;

import com.google.gson.annotations.SerializedName;

public class WeatherDto {

    @SerializedName("main")
    private MainDto mainDto;

    @SerializedName("wind")
    private WindDto windDto;

    public MainDto getMainDto() {
        return mainDto;
    }

    public WindDto getWindDto() {
        return windDto;
    }

    public static class MainDto{

        @SerializedName("temp")
        private double temp;

        @SerializedName("pressure")
        private int pressure;

        public int getPressure() {
            return pressure;
        }
        public double getTemp() {
            return temp;
        }
    }

    public static class WindDto{

        @SerializedName("speed")
        private double speed;

        public double getSpeed() {
            return speed;
        }
    }
}
