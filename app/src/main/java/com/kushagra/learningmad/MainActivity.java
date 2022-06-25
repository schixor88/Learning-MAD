package com.kushagra.learningmad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    SimpleRecyclerViewAdapter adapter;

//    ArrayList<String> apiData = new ArrayList<>();
    ArrayList<SampleModel> apiData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActionBar().hide();

//        apiData.add("Hello");
//        apiData.add("Hello");
//        apiData.add("Hello");
//        apiData.add("Hello");
//        apiData.add("Hello");
//        apiData.add("Hello");


        apiData.add(
                new SampleModel(
                        "ram",
                        "9867336677",
                        "Kathmandu",
                        "email@gmail.com")
        );

        apiData.add(
                new SampleModel(
                        "shyam",
                        "9867336677",
                        "Bhaktapur",
                        "shyam@gmail.com")
        );

        apiData.add(
                new SampleModel(
                        "hari",
                        "9867336677",
                        "Kathmandu",
                        "email@gmail.com")
        );

        apiData.add(
                new SampleModel(
                        "sita",
                        "9867336677",
                        "Lalitpur",
                        "sita@gmail.com")
        );

        recyclerView = findViewById(R.id.recycler_view);
        linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL, false);
        adapter = new SimpleRecyclerViewAdapter(apiData);


        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);

    }


}