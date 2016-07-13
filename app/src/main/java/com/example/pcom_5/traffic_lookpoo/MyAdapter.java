package com.example.pcom_5.traffic_lookpoo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Pcom5 on 6/22/2016.
 */
public class MyAdapter extends BaseAdapter{
    private Context objContext;
    private int[] trafficInts;
    private String[] trafficStrings;

    public MyAdapter (Context objContext, int[] trafficInts, String[] trafficStrings){
        this.objContext = objContext;
        this.trafficInts = trafficInts;
        this.trafficStrings = trafficStrings;
    }//Constructor

    @Override
    public int getCount() {
        return trafficStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = objLayoutInflater.inflate(R.layout.my_listview, viewGroup, false);
        //show Icon
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imvShowicon);
        iconImageView.setBackgroundResource(trafficInts[i]);
        //Show Title
        TextView titleTextView = (TextView) view1.findViewById(R.id.txtShowTitle);
        titleTextView.setText(trafficStrings[i]);

        return view1;
    }//getView
}//Main Class
