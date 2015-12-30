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

/**
 * A fragment representing a single Engine detail screen.
 * This fragment is either contained in a {@link EngineListActivity}
 * in two-pane mode (on tablets) or a {@link EngineDetailActivity}
 * on handsets.
 */
public class EngineDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private EngineContent.Engine mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public EngineDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = EngineContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.content);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_engine_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.engine_displacement)).setText(mItem.displacement);
            ((TextView) rootView.findViewById(R.id.engine_horsepower)).setText(mItem.horsepower);
            ((TextView) rootView.findViewById(R.id.engine_torque)).setText(mItem.torque);
            ((TextView) rootView.findViewById(R.id.engine_compression)).setText(mItem.compression);
            ((TextView) rootView.findViewById(R.id.engine_bore)).setText(mItem.bore);
            ((TextView) rootView.findViewById(R.id.engine_stroke)).setText(mItem.stroke);




        }

        return rootView;
    }
}
