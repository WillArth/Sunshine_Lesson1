package com.example.william.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        List<String> al = new ArrayList();

        al.add(("Today - Sunny - 88/63"));
        al.add(("Tomorrow - Foggy - 70/46"));
        al.add(("Weds - Cloudy - 72/63"));
        al.add(("Thurs - Rainy - 64/51"));
        al.add(("Frid - Foggy - 70/46"));
        al.add(("Sat - Sunny - 76/68"));

        ArrayAdapter<String>  forecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                //ID of List item layout
                R.layout.list_item_forecast,
                //ID of the textview to populate
                R.id.list_item_forecast_textview,

                al
        );

        ListView listView = (ListView)rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter((forecastAdapter));
        return rootView;


    }




}
