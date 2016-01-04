package com.newapp.lsxsource;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.newapp.lsxsource.engine.EngineContent;


public class EngineDetailFragment extends Fragment {

    public static final String ARG_ITEM_ID = "item_id";

    private EngineContent.Engine mItem;

    public EngineDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            mItem = EngineContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.code);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_engine_detail, container, false);

        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.engine_gen)).setText(mItem.gen);
            ((TextView) rootView.findViewById(R.id.engine_volume)).setText(mItem.volume);
            ((TextView) rootView.findViewById(R.id.engine_displacement)).setText(mItem.displacement);
            ((TextView) rootView.findViewById(R.id.engine_horsepower)).setText(mItem.horsepower);
            ((TextView) rootView.findViewById(R.id.engine_torque)).setText(mItem.torque);
            ((TextView) rootView.findViewById(R.id.engine_compression)).setText(mItem.compression);
            ((TextView) rootView.findViewById(R.id.engine_bore)).setText(mItem.bore);
            ((TextView) rootView.findViewById(R.id.engine_stroke)).setText(mItem.stroke);
            ((TextView) rootView.findViewById(R.id.engine_intakePortType)).setText(mItem.intakePortType);
            ((TextView) rootView.findViewById(R.id.engine_tbSize)).setText(mItem.tbSize);
            ((TextView) rootView.findViewById(R.id.engine_tbBolts)).setText(mItem.tbBolts);
        }
        return rootView;
    }
}
