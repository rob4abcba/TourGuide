package example.android.tourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * build by james heath 7/18/2018
 */
public class PlanetsFragment extends Fragment {


    public PlanetsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        
        View rootView = inflater.inflate(R.layout.entry_list, container, false);
        // build the arraylist for parks
        final ArrayList<ItemObject> planet = new ArrayList<>();
        planet.add(new ItemObject(getString(R.string.mercury),R.drawable.mercury));
        planet.add(new ItemObject(getString(R.string.venus),R.drawable.venus));
        planet.add(new ItemObject(getString(R.string.earth),R.drawable.earth));
        planet.add(new ItemObject(getString(R.string.mars),R.drawable.mars));
        planet.add(new ItemObject(getString(R.string.jupiter),R.drawable.jupiter));
        planet.add(new ItemObject(getString(R.string.saturn),R.drawable.saturn));
        planet.add(new ItemObject(getString(R.string.uranus),R.drawable.uranus));
        planet.add(new ItemObject(getString(R.string.neptune),R.drawable.neptune));

        DisplayAdaptor displayAdapter = new DisplayAdaptor (getActivity(), planet);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(displayAdapter);

        // on click listener for the list items
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // find the item clicked on and get its name
                ItemObject page = planet.get(position);
                String item = page.getPlanetName();

                // pass the item name to the new activity.
                Intent details = new Intent(getActivity(), Details.class);
                details.putExtra("key",item);
                startActivity(details);
            }
        });

        return rootView;

    }

}
