package com.newapp.lsxsource;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;



public class EngineListActivity extends AppCompatActivity implements EngineListFragment.Callbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engine_app_bar);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());
    }

    @Override
    public void onItemSelected(String id) {
            Intent detailIntent = new Intent(this, EngineDetailActivity.class);
            detailIntent.putExtra(EngineDetailFragment.ARG_ITEM_ID, id);
            startActivity(detailIntent);
    }
}

