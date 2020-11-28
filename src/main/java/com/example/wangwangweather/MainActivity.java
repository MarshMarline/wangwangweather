package com.example.wangwangweather;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import org.litepal.LitePal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //SQLiteDatabase db = LitePal.getDatabase();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
