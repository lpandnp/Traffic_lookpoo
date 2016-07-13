package com.example.pcom_5.traffic_lookpoo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createListView();
    } //Main Method
    private  void createListView(){
        MyData objMyData = new MyData();
        int[] intIcon = objMyData.icon();
        String[] strTitle = objMyData.title();

        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, intIcon, strTitle);
        ListView MyListView = (ListView) findViewById(R.id.listView);
        MyListView.setAdapter(objMyAdapter);
    }//createListView
    public void clickSound(View view) {
        Intent objIntent = new Intent(Intent.ACTION_VIEW);
        objIntent.setData(Uri.parse("http://ntc.pnu.ac.th"));
        startActivity(objIntent);
    }
}
