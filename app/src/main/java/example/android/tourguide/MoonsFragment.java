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

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MoonsFragment extends Fragment {


    public MoonsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.entry_list, container, false);
        // build the arraylist for moons
        final ArrayList<ItemObject> planet = new ArrayList<>();
        planet.add(new ItemObject(
                getString(R.string.earth_moon),
                R.drawable.earth_moon,
                R.string.earth_moon_text_box_1,
                R.string.earth_moon_text_box_2,
                R.string.earth_moon_text_box_3,
                R.string.earth_moon_text_box_4,
                R.string.earth_moon_text_box_5,
                R.string.earth_moon_text_box_6,
                R.string.earth_moon_text_box_7));
        planet.add(new ItemObject(
                getString(R.string.mars_moon_deimos),
                R.drawable.mars_moon_deimos,
                R.string.mars_moon_deimos_text_box_1,
                R.string.mars_moon_deimos_text_box_2,
                R.string.mars_moon_deimos_text_box_3,
                R.string.mars_moon_deimos_text_box_4,
                R.string.mars_moon_deimos_text_box_5,
                R.string.mars_moon_deimos_text_box_6,
                R.string.mars_moon_deimos_text_box_7));
        planet.add(new ItemObject(
                getString(R.string.mars_moon_phobos),
                R.drawable.mars_moon_phobos,
                R.string.earth_text_box_1,
                R.string.earth_text_box_2,
                R.string.earth_text_box_3,
                R.string.earth_text_box_4,
                R.string.earth_text_box_5,
                R.string.earth_text_box_6,
                R.string.earth_text_box_7));
        planet.add(new ItemObject(
                getString(R.string.jupiter_moon_Callisto),
                R.drawable.jupitor_moon_callisto,
                R.string.jupiter_moon_Callisto_text_box_1,
                R.string.jupiter_moon_Callisto_text_box_2,
                R.string.jupiter_moon_Callisto_text_box_3,
                R.string.jupiter_moon_Callisto_text_box_4,
                R.string.jupiter_moon_Callisto_text_box_5,
                R.string.jupiter_moon_Callisto_text_box_6,
                R.string.jupiter_moon_Callisto_text_box_7));
        planet.add(new ItemObject(
                getString(R.string.jupiter_moon_Europa),
                R.drawable.jupitor_moon_europa,
                R.string.jupiter_moon_Europa_text_box_1,
                R.string.jupiter_moon_Europa_text_box_2,
                R.string.jupiter_moon_Europa_text_box_3,
                R.string.jupiter_moon_Europa_text_box_4,
                R.string.jupiter_moon_Europa_text_box_5,
                R.string.jupiter_moon_Europa_text_box_6,
                R.string.jupiter_moon_Europa_text_box_7));
        planet.add(new ItemObject(
                getString(R.string.jupiter_moon_Ganymede),
                R.drawable.jupitor_moon_ganymede,
                R.string.jupiter_moon_Ganymede_text_box_1,
                R.string.jupiter_moon_Ganymede_text_box_2,
                R.string.jupiter_moon_Ganymede_text_box_3,
                R.string.jupiter_moon_Ganymede_text_box_4,
                R.string.jupiter_moon_Ganymede_text_box_5,
                R.string.jupiter_moon_Ganymede_text_box_6,
                R.string.jupiter_moon_Ganymede_text_box_7));
        planet.add(new ItemObject(
                getString(R.string.jupiter_moon_io),
                R.drawable.jupitor_moon_io,
                R.string.jupiter_moon_io_text_box_1,
                R.string.jupiter_moon_io_text_box_2,
                R.string.jupiter_moon_io_text_box_3,
                R.string.jupiter_moon_io_text_box_4,
                R.string.jupiter_moon_io_text_box_5,
                R.string.jupiter_moon_io_text_box_6,
                R.string.jupiter_moon_io_text_box_7));
        planet.add(new ItemObject(
                getString(R.string.saturn_moon_enceladus),
                R.drawable.saturn_moon_enceladus,
                R.string.saturn_moon_enceladus_text_box_1,
                R.string.saturn_moon_enceladus_text_box_2,
                R.string.saturn_moon_enceladus_text_box_3,
                R.string.saturn_moon_enceladus_text_box_4,
                R.string.saturn_moon_enceladus_text_box_5,
                R.string.saturn_moon_enceladus_text_box_6,
                R.string.saturn_moon_enceladus_text_box_7));
        planet.add(new ItemObject(
                getString(R.string.saturn_moon_hyperion),
                R.drawable.saturn_moon_hyperion,
                R.string.saturn_moon_hyperion_text_box_1,
                R.string.saturn_moon_hyperion_text_box_2,
                R.string.saturn_moon_hyperion_text_box_3,
                R.string.saturn_moon_hyperion_text_box_4,
                R.string.saturn_moon_hyperion_text_box_5,
                R.string.saturn_moon_hyperion_text_box_6,
                R.string.saturn_moon_hyperion_text_box_7));
        planet.add(new ItemObject(
                getString(R.string.saturn_moon_laptus),
                R.drawable.saturn_moon_laptus,
                R.string.saturn_moon_laptus_text_box_1,
                R.string.saturn_moon_laptus_text_box_2,
                R.string.saturn_moon_laptus_text_box_3,
                R.string.saturn_moon_laptus_text_box_4,
                R.string.saturn_moon_laptus_text_box_5,
                R.string.saturn_moon_laptus_text_box_6,
                R.string.saturn_moon_laptus_text_box_7));
        planet.add(new ItemObject(
                getString(R.string.saturn_moon_mimas),
                R.drawable.saturn_moon_mimas,
                R.string.saturn_moon_mimas_text_box_1,
                R.string.saturn_moon_mimas_text_box_2,
                R.string.saturn_moon_mimas_text_box_3,
                R.string.saturn_moon_mimas_text_box_4,
                R.string.saturn_moon_mimas_text_box_5,
                R.string.saturn_moon_mimas_text_box_6,
                R.string.saturn_moon_mimas_text_box_7));
        planet.add(new ItemObject(
                getString(R.string.saturn_moon_rhea),
                R.drawable.saturn_moon_rhea,
                R.string.saturn_moon_rhea_text_box_1,
                R.string.saturn_moon_rhea_text_box_2,
                R.string.saturn_moon_rhea_text_box_3,
                R.string.saturn_moon_rhea_text_box_4,
                R.string.saturn_moon_rhea_text_box_5,
                R.string.saturn_moon_rhea_text_box_6,
                R.string.saturn_moon_rhea_text_box_7));
        planet.add(new ItemObject(
                getString(R.string.saturn_moon_thtys),
                R.drawable.saturn_moon_thtys,
                R.string.saturn_moon_thtys_text_box_1,
                R.string.saturn_moon_thtys_text_box_2,
                R.string.saturn_moon_thtys_text_box_3,
                R.string.saturn_moon_thtys_text_box_4,
                R.string.saturn_moon_thtys_text_box_5,
                R.string.saturn_moon_thtys_text_box_6,
                R.string.saturn_moon_thtys_text_box_7));
        planet.add(new ItemObject(
                getString(R.string.saturn_moon_triton),
                R.drawable.saturn_moon_triton,
                R.string.saturn_moon_triton_text_box_1,
                R.string.saturn_moon_triton_text_box_2,
                R.string.saturn_moon_triton_text_box_3,
                R.string.saturn_moon_triton_text_box_4,
                R.string.saturn_moon_triton_text_box_5,
                R.string.saturn_moon_triton_text_box_6,
                R.string.saturn_moon_triton_text_box_7));

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
