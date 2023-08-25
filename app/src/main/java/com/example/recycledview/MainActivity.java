package com.example.recycledview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MonthhAdapter monthAdapter;
    private List<MonthModel> monthList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.RV);
        monthList = generateMonthList();
        monthAdapter = new MonthhAdapter(monthList);
        recyclerView.setAdapter(monthAdapter);
    }
    private List<MonthModel> generateMonthList() {
        List<MonthModel> months = new ArrayList<>();
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (String monthName : monthNames) {
            months.add(new MonthModel(monthName));
        }
        return months;

    }

}
