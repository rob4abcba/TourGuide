package example.android.tourguide;

/**
 * Created by james on 7/15/2018.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PageAdaptor extends FragmentStatePagerAdapter {
    private Context mContext;

    public PageAdaptor(android.support.v4.app.FragmentManager fm,  Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                ParksFragment tab1 = new ParksFragment();
                return tab1;
            case 1:
                RestaurantsFragment tab2 = new RestaurantsFragment();
                return tab2;
            case 2:
                EventsFragment tab3 = new EventsFragment();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Override

    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.tab1);
        } else if (position == 1) {
            return mContext.getString(R.string.tab2);
        } else {
            return mContext.getString(R.string.tab3);}
    }
}