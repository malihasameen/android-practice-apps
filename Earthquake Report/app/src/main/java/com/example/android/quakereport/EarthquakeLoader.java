package com.example.android.quakereport;

import android.content.Context;
import android.content.AsyncTaskLoader;

import java.util.List;

/**
 * Created by DELL on 2/6/2018.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    /** Tag for log messages */
    private static final String LOG_TAG = EarthquakeLoader.class.getName();

    // Member variable
    private String mUrl;

    public EarthquakeLoader (Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        if(mUrl == null) {
            return null;
        }

        // Fetch data from url and add to the list
        List<Earthquake> data = QueryUtils.fetchEarthquakeData(mUrl);
        return data;
    }
}
