package com.example.zc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void test(){
        System.out.print("123123123");
    }
    public void test02(){
        System.out.print(13213123);
        System.out.print(13213123);
    }
}
