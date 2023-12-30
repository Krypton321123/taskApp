package com.learning.taskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView list;
    List<task> taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.listView);
        taskList = new ArrayList<>();
        taskList.add(new task("Making the fucking breakfast",false));
        taskList.add(new task("Walk the dogs",false));
        taskAdapter adapter = new taskAdapter(getApplicationContext(), taskList);
        list.setAdapter(adapter);
    }
}