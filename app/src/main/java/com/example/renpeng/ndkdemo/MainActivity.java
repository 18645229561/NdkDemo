package com.example.renpeng.ndkdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    private static int ttt = 0;
    static {
        System.loadLibrary("mainactivity");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);
        textView.setText(getString());
    }

    public native String getString();

    public void setTtt(){
        Log.d("www","pppppppppppppp");
    }
}
