package com.dinpay.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class AQI {

    @SerializedName("city")
    public City city;

    public class City{

        @SerializedName("aqi")
        public String aqi;

        @SerializedName("pm25")
        public String pm25;

    }
}
