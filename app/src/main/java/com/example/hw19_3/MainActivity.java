package com.example.hw19_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CarAdapter adapter;
    private ArrayList<String> carList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        recyclerView = findViewById(R.id.rv_car);
        loadData();
        adapter = new CarAdapter(carList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        carList.add("BMW");
        carList.add("Mercedes");
        carList.add("Audi");
        carList.add("Porsche");
        carList.add("Ferrari");
        carList.add("Lamborghini");
        carList.add("Maserati");
        carList.add("Bugatti");
        carList.add("Mitsubishi");
        carList.add("Toyota");
        carList.add("Honda");
        carList.add("Suzuki");
        carList.add("Nissan");
        carList.add("Isuzu");
        carList.add("Kawasaki");
    }
}