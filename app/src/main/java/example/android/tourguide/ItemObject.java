package example.android.tourguide;

/**
 * Created by james on 7/15/2018.
 */

public class ItemObject {

    // mLocationNames to store the name of the place
    private String mLocationName;
    // mAddress to store the address
    // mMaps to store the google maps gps link
    // mPhotoID to store the image id ref
    // mComment to store the text info


    public ItemObject (String name) {
        mLocationName = name;
    }

    public String getLocationName () {return mLocationName;}
}
