package com.example.mtleinon.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] data = {
                "Mon 7/11 - Cloudy - 18/12",
                "Tue 7/12 - Sunny - 20/15",
                "Wed 7/13 - Rainy - 17/14",
                "Thurs 7/14 - Cloudy - 19/15",
                "Fri 7/15 - Sunny - 21/17",
                "Sat 7/16 - Sunny - 22/18",
                "Sun 7/17 - Cloudy - 20/16"
        };
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(data));

        mForecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast);

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.ListViewForecast);
        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}
