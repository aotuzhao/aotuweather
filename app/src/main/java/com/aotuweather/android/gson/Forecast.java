package com.aotuweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/2/3.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Tmp tmp;

    @SerializedName("cond")
    public Cond cond;

    public class Cond {

        @SerializedName("txt_d")
        public String info;
    }
    public class Tmp{

        public String max;

        public String min;

    }
}
