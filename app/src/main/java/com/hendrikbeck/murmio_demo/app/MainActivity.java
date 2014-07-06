package com.hendrikbeck.murmio_demo.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import io.murmio.android.sdk.Murm;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openCheckDemoActivity(View view) {
        Intent intent = new Intent(this, CheckoutDemoActivity.class);
        startActivity(intent);
    }

}
