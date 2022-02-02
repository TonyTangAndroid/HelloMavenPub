package com.example.hello_aar;

import android.content.Context;

public class HelloAarUtil {

    /**
     *
     * @param fullName the full name to be greeted.
     * @param context {@link Context}
     * @return a template string like `Welcome TonyTang to Maven AAR!`
     */
    public static String greeting(String fullName, Context context) {
        return context.getString(R.string.hello_maven_template, fullName);
    }
}