package example.android.tourguide;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * A simple {@link Fragment} subclass.
 * created 7/16/2018 by james heath
 * for udacity tour guide app
 */
public class DetailsFragment extends Fragment {
    public DetailsFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false);
    }
}
