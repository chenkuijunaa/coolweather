package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chenkuijun on 2017/11/8.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("text")
        public String info;
    }
}
