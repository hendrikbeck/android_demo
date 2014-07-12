package com.hendrikbeck.murmio_demo.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;

import io.murmio.android.sdk.Murm;

public class CheckoutDemoActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_checkout);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Murm m = (Murm) findViewById(R.id.murm_view_example);
        m.setUserId("Hendrik Beck");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void finishDemo(View view) {
        this.finish();
    }

}
