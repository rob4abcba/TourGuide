package example.android.tourguide;

/**
 * Created by james on 7/15/2018.
 */

public class ItemObject {

    // mPlanetNames to store the name of the planet/moon/object
    private String mPlanetName;
    // mPhotoID to store the image id ref
    private int mImageID;
    // mComments to store the text info
    private int mTextBoxInfo1;
    private int mTextBoxInfo2;
    private int mTextBoxInfo3;
    private int mTextBoxInfo4;
    private int mTextBoxInfo5;
    private int mTextBoxInfo6;
    private int mTextBoxInfo7;

    public ItemObject (String name, int imageID, int textInfo1, int textInfo2,int textInfo3,int textInfo4,int textInfo5,int textInfo6,int textInfo7) {

        mPlanetName = name;
        mImageID = imageID;

        mTextBoxInfo1 = textInfo1;
        mTextBoxInfo2 = textInfo2;
        mTextBoxInfo3 = textInfo3;
        mTextBoxInfo4 = textInfo4;
        mTextBoxInfo5 = textInfo5;
        mTextBoxInfo6 = textInfo6;
        mTextBoxInfo7 = textInfo7;

    }

    public String getPlanetName () {return mPlanetName;}
    public int getImageID(){return mImageID;}

    public int getPlanetText1 () {return mTextBoxInfo1;}
    public int getPlanetText2 () {return mTextBoxInfo2;}
    public int getPlanetText3 () {return mTextBoxInfo3;}
    public int getPlanetText4 () {return mTextBoxInfo4;}
    public int getPlanetText5 () {return mTextBoxInfo5;}
    public int getPlanetText6 () {return mTextBoxInfo6;}
    public int getPlanetText7 () {return mTextBoxInfo7;}
}
