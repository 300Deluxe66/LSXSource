package com.newapp.lsxsource;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;

import com.newapp.lsxsource.engine.EngineContent;


public class EngineDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engine_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.detail_toolbar);
        setSupportActionBar(toolbar);

        // Show the Up button in the action bar.
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (savedInstanceState == null) {
            // Create the detail fragment and add it to the activity using a fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putString(EngineDetailFragment.ARG_ITEM_ID,
                    getIntent().getStringExtra(EngineDetailFragment.ARG_ITEM_ID));
            EngineDetailFragment fragment = new EngineDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.engine_detail_container, fragment)
                    .commit();
        }
    }

    public void onClick(View view) {
        Bundle engineData = getIntent().getExtras();
        String engineId = engineData.getString(EngineDetailFragment.ARG_ITEM_ID);
        EngineContent.Engine mItem;
        mItem = EngineContent.ITEM_MAP.get(engineId);

        final Snackbar snackBar = Snackbar.make(view, mItem.applications, Snackbar.LENGTH_INDEFINITE);

        snackBar.setAction("Close", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackBar.dismiss();
            }
        });
        snackBar.show();
    }

    public void onClick2(View view) {
        Bundle engineData = getIntent().getExtras();
        String engineId = engineData.getString(EngineDetailFragment.ARG_ITEM_ID);
        EngineContent.Engine mItem;
        mItem = EngineContent.ITEM_MAP.get(engineId);

        final Snackbar snackBar = Snackbar.make(view, mItem.code, Snackbar.LENGTH_INDEFINITE);

        snackBar.setAction("Close", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackBar.dismiss();
            }
        });
        snackBar.show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            NavUtils.navigateUpTo(this, new Intent(this, EngineListActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
