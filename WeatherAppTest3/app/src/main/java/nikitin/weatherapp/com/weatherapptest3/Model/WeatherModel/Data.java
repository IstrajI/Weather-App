package nikitin.weatherapp.com.weatherapptest3.Model.WeatherModel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Влад on 04.10.2016.
 */
public class Data implements Serializable{
    @SerializedName("temp")
    private double temp;
    @SerializedName("pressure")
    private double pressure;
    @SerializedName("humidity")
    private int humidity;
    @SerializedName("temp_min")
    private double temp_min;
    @SerializedName("temp_max")
    private double temp_max;
    @SerializedName("sea_level")
    private double sea_level;
    @SerializedName("grnd_level")
    private double grnd_level;

    public Data() {
        temp = 0;
        pressure = 0;
        humidity = 0;
        temp_min = 0;
        temp_max = 0;
        sea_level = 0;
        grnd_level = 0;

    }

    public Data (int temp, double pressure, int humidity, int temp_min, int temp_max, double sea_level, double grnd_level) {
        this.temp = temp;
        this.pressure = pressure;
        this. humidity = humidity;
        this.temp_min = temp_min;
        this.temp_min = temp_max;
        this.sea_level = sea_level;
        this.grnd_level = grnd_level;
    }

    public double getTemp() {
        return temp;
    }
    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getPressure() {
        return pressure;
    }
    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getTemp_min() {
        return temp_min;
    }
    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    public double getTemp_max() {
        return temp_max;
    }
    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    public double getSea_level() {
        return sea_level;
    }
    public void setSea_level(double sea_level) {
        this.sea_level = sea_level;
    }

    public double getGrnd_level() {
        return grnd_level;
    }
    public void setGrnd_level(double grnd_level) {
        this.grnd_level = grnd_level;
    }
}
