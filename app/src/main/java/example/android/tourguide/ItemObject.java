package example.android.tourguide;

/**
 * Created by james on 7/15/2018.
 */

public class ItemObject {

    // mPlanetNames to store the name of the planet/moon/object
    private String mPlanetName;
    // mPhotoID to store the image id ref
    private int mImageID;
    // mComment to store the text info


    public ItemObject (String name, int imageID) {

        mPlanetName = name;
        mImageID = imageID;
    }

    public String getPlanetName () {return mPlanetName;}
    public int getImageID(){return mImageID;}
}
