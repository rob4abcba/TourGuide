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
 */
public class ManMadeFragment extends Fragment {
    public ManMadeFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.entry_list, container, false);
        // build the arraylist for planets
        final ArrayList<ItemObject> planet = new ArrayList<>();
        planet.add(new ItemObject(
                getString(R.string.asteroids),
                R.drawable.astroid,
                R.string.asteroids_text_box_1,
                R.string.asteroids_text_box_2,
                R.string.asteroids_text_box_3,
                R.string.asteroids_text_box_4,
                R.string.asteroids_text_box_5,
                R.string.asteroids_text_box_6,
                R.string.asteroids_text_box_7));
        planet.add(new ItemObject(
                getString(R.string.comet),
                R.drawable.comet,
                R.string.comet_text_box_1,
                R.string.comet_text_box_2,
                R.string.comet_text_box_3,
                R.string.comet_text_box_4,
                R.string.comet_text_box_5,
                R.string.comet_text_box_6,
                R.string.comet_text_box_7));
        planet.add(new ItemObject(
                getString(R.string.iss),
                R.drawable.iss,
                R.string.iss_text_box_1,
                0,
                R.string.iss_text_box_3,
                0,
                R.string.iss_text_box_5,
                0,
                R.string.iss_text_box_7));
        planet.add(new ItemObject(
                getString(R.string.hubble),
                R.drawable.hubble,
                R.string.hubble_text_box_1,
                R.string.hubble_text_box_2,
                R.string.hubble_text_box_3,
                R.string.hubble_text_box_4,
                R.string.hubble_text_box_5,
                R.string.hubble_text_box_6,
                R.string.hubble_text_box_7));
        DisplayAdaptor displayAdapter = new DisplayAdaptor (getActivity(), planet);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(displayAdapter);
        // on click listener for the list items
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // find the item clicked on and get its name
                ItemObject page = planet.get(position);
                String item1 = page.getPlanetName();
                // collect the R.id's for the text views
                int item2 = page.getPlanetText1();
                int item3 = page.getPlanetText2();
                int item4 = page.getPlanetText3();
                int item5 = page.getPlanetText4();
                int item6 = page.getPlanetText5();
                int item7 = page.getPlanetText6();
                int item8 = page.getPlanetText7();
                // get correct picture
                int item9 = page.getImageID();
                // pass the item name and text string id's to the new activity.
                Intent details = new Intent(getActivity(), Details.class);
                details.putExtra("key",item1);
                details.putExtra("text2",item2);
                details.putExtra("text3",item3);
                details.putExtra("text4",item4);
                details.putExtra("text5",item5);
                details.putExtra("text6",item6);
                details.putExtra("text7",item7);
                details.putExtra("text8",item8);
                details.putExtra("text9",item9);
                startActivity(details);
            }
        });
        return rootView;
    }
}