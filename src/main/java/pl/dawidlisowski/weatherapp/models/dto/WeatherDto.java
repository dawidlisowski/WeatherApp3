package pl.dawidlisowski.weatherapp.models.dto;

import com.google.gson.annotations.SerializedName;

public class WeatherDto {

    @SerializedName("main")
    private TempDto tempDto;

//    @SerializedName("pressure")
//    private PressureDto pressureDto;

    public TempDto getTempDto() {
        return tempDto;
    }

//    public PressureDto getPressureDto() {
//        return pressureDto;
//    }

    public static class TempDto{

        @SerializedName("temp")
        private double temp;

        public double getTemp() {
            return temp;
        }
    }

//    public static class PressureDto{
//
//        @SerializedName("pressure")
//        private double pressure;
//
//        public double getPressure() {
//            return pressure;
//        }
//    }
}
