package example.android.tourguide;


import android.content.Intent;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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
        parks.add(new ItemObject(getString(R.string.sport_park),R.drawable.tab_sports_park));
        parks.add(new ItemObject(getString(R.string.city_park),R.drawable.tab_city_park));
        parks.add(new ItemObject(getString(R.string.sport_park),R.drawable.tab_sports_park));
        parks.add(new ItemObject(getString(R.string.sport_park),R.drawable.tab_sports_park));

        DisplayAdaptor displayAdapter = new DisplayAdaptor (getActivity(), parks);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(displayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                //ItemObject page = parks.get(position);

                //Toast.makeText(getActivity(), "you clicked"+ parks.get(position), Toast.LENGTH_SHORT).show();

                Intent details = new Intent(getActivity(), Details.class);
                startActivity(details);
            }
        });

        return rootView;

    }

}
