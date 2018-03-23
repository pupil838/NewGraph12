package com.capstone.kumar.newgraph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    BarChart barChart;
    private Button mPaiChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPaiChart = (Button) findViewById(R.id.paiGraph);

        mPaiChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Paichart.class));
            }
        });
//        barChart = (BarChart) findViewById(R.id.barGraph);

//        ArrayList<BarEntry> barEntries = new ArrayList<>();
//        barEntries.add(new BarEntry(44f,0));
//        barEntries.add(new BarEntry(38f,1));
//        barEntries.add(new BarEntry(88f,2));
//        barEntries.add(new BarEntry(66f,3));
//        barEntries.add(new BarEntry(33f,4));
//        barEntries.add(new BarEntry(11f,5));
//        BarDataSet barDataSet = new BarDataSet(barEntries,"Dates");
//
//        ArrayList<String> theDates = new ArrayList<>();
//        theDates.add("April");
//        theDates.add("May");
//        theDates.add("June");
//        theDates.add("July");
//        theDates.add("Aug");
//        theDates.add("Sep");
//
//        BarData theData = new BarData(theDates, barDataSet);
//        barChart.setData(theData);
//
//        barChart.setTouchEnabled(true);
//        barChart.setDragEnabled(true);
//        barChart.setScaleEnabled(true);

    }

}
