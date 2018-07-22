package example.android.tourguide;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
/**
 * Created by james on 7/15/2018.
 * by james heath
 * udacity tour guide app
 */
public class DisplayAdaptor extends ArrayAdapter<ItemObject> {
    public DisplayAdaptor(Activity context, ArrayList<ItemObject> parks) {
        super(context, 0, parks);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_layout, parent, false);
        }
        // get the current object located at position
        ItemObject currentObject = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = listItemView.findViewById(R.id.item_name);
        nameTextView.setText(currentObject.getPlanetName());
        ImageView itemImage = listItemView.findViewById(R.id.item_img);
        itemImage.setImageResource(currentObject.getImageID());
        return listItemView;
    }
}