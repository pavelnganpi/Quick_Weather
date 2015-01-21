package com.paveynganpi.quickweather;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String apiKey = "6d41fa95e035d900060eefa2f45cab81";
        double latitude = 37.8267;
        double longitude = -122.423;

        String forecastUrl = "https://api.forecast.io/forecast/" + apiKey+ "/"+ latitude + ","+ longitude;

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(forecastUrl).
                build();

        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                Log.v(TAG,"error from request");

            }

            @Override
            public void onResponse(Response response) throws IOException {

                try {
                    Log.v(TAG, response.body().string());

                    if (!response.isSuccessful()) {
                        alertUserAboutError();
                    } else {

                    }
                }
                catch (IOException e){
                    Log.e(TAG,"Exception caught :",e);
                }
            }
        });

    }

    private void alertUserAboutError() {



    }


}
