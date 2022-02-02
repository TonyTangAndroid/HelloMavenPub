package com.example.hellomaven;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_greetings = findViewById(R.id.tv_greetings);
        tv_greetings.setText(com.example.hello_jar.HelloJarUtil.duplicate(com.example.hello_aar.HelloAarUtil.greeting("TonyTang", this)));
    }

}