package example.android.tourguide;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //TextView textView = new TextView(getActivity());
        //textView.setText(R.string.tab1);

        View rootView = inflater.inflate(R.layout.entry_list, container, false);

        // build the arraylist for parks
        final ArrayList<ItemObject> parks = new ArrayList<>();
        parks.add(new ItemObject(""+ R.string.sport_park));
        parks.add(new ItemObject("b"));
        parks.add(new ItemObject("c"));
        parks.add(new ItemObject("d"));

        DisplayAdaptor displayAdapter = new DisplayAdaptor (getActivity(), parks);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(displayAdapter);

        return rootView;
    }

}
