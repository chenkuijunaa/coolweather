package com.coolweather.android.util;

import android.app.*;

/**
 * Created by chenkuijun on 2017/11/8.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        DownloadManager.Request request=new DownloadManager.Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
