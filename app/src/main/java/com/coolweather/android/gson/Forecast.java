package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lC on 2017/11/1.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Tempreature tempreature;

    @SerializedName("cond")
    public More more;

    public class Tempreature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
