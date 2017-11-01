package com.chen4du.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lC on 2017/11/1.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
