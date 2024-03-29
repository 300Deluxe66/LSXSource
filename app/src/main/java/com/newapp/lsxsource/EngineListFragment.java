package com.newapp.lsxsource;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.newapp.lsxsource.engine.EngineContent;


public class EngineListFragment extends ListFragment {


     /* The fragment's current callback object, which is notified of list item clicks.*/
    private Callbacks mCallbacks = sEngineCallbacks;

     /* A callback interface that all activities containing this fragment must
     implement. This mechanism allows activities to be notified of item selections.*/
    public interface Callbacks {
        public void onItemSelected(String id); // A callback for when an item has been selected.
    }

    //Used only when this fragment is not attached to an activity
    private static Callbacks sEngineCallbacks = new Callbacks() {
        @Override
        public void onItemSelected(String id) {
        }
    };

    //Mandatory empty constructor for the fragment manager to instantiate the fragment (e.g. upon screen orientation changes)
    public EngineListFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // TODO: replace with a real list adapter.
        setListAdapter(new ArrayAdapter<EngineContent.Engine>(
                getActivity(),
                android.R.layout.simple_list_item_activated_1,
                android.R.id.text1,
                EngineContent.ITEMS));
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // Activities containing this fragment must implement its callbacks.
        if (!(activity instanceof Callbacks)) {
            throw new IllegalStateException("Activity must implement fragment's callbacks.");
        }

        mCallbacks = (Callbacks) activity;
    }

    @Override
    public void onDetach() {
        super.onDetach();

        // Reset the active callbacks interface to the dummy implementation.
        mCallbacks = sEngineCallbacks;
    }

    @Override
    public void onListItemClick(ListView listView, View view, int position, long id) {
        super.onListItemClick(listView, view, position, id);

        // Notify the active callbacks interface (the activity, if the fragment is attached to one) that an item has been selected.
        mCallbacks.onItemSelected(EngineContent.ITEMS.get(position).id);
    }
}
