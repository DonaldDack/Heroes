package com.example.dmitry.heroesgame;

import android.content.Context;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Dmitry on 23.04.2016.
 */
public class Hero {
    protected int[] image;
    protected String name;
    protected String info;
    protected int j;

    protected void drawHero(Context context, GridView gridView, int cntTrying){
        ArrayList<Map<String, Object>> data = new ArrayList<>();
        Map<String, Object> m;
        for (int i = 0; i < cntTrying; ++i){
            m = new HashMap<>();
            m.put("picture", image[i]);
            data.add(m);
        }
        for (int i = cntTrying; i < 4; ++i)
        {
            m = new HashMap<>();
            m.put("picture", R.drawable.who);
            data.add(m);
        }
        String[] from = {"picture"};
        int[] to = {R.id.gvImg};
        SimpleAdapter adapter = new SimpleAdapter(context, data, R.layout.item, from, to);
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);
        gridView.setHorizontalSpacing(10);
        gridView.setVerticalSpacing(10);
        gridView.setMinimumHeight(300);
    }

}
