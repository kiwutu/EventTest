package ru.kiwutu.eventtest.ui;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import ru.kiwutu.eventtest.data.API.RequestEventList;

import ru.kiwutu.eventtest.R;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    RequestEventList eventList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        tv.setText(eventList.toString());
//        Log.println(Log.WARN,"RESULT: ", eventList.toString());
    }

    private void init(){
        tv = findViewById(R.id.text_view);
        eventList =new RequestEventList();
    }


}