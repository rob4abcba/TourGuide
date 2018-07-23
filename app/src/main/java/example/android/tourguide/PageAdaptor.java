package example.android.tourguide;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
 /**
 * Created by james on 7/15/2018.
 * built for udacity tour guide app
 */
public class PageAdaptor extends FragmentStatePagerAdapter {
    private Context mContext;
    public PageAdaptor(android.support.v4.app.FragmentManager fm,  Context context) {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        //show correct fragment
        switch (position) {
            case 0:
                PlanetsFragment tab1 = new PlanetsFragment();
                return tab1;
            case 1:
                MoonsFragment tab2 = new MoonsFragment();
                return tab2;
            case 2:
                ManMadeFragment tab3 = new ManMadeFragment();
                return tab3;
            case 3:
                DeepSpaceFragment tab4 = new DeepSpaceFragment();
                return tab4;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return 4;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        // name the tabs
        if (position == 0) {
            return mContext.getString(R.string.tab1);
        } else if (position == 1) {
            return mContext.getString(R.string.tab2);
        } else if (position == 2) {
            return mContext.getString(R.string.tab3);
        } else {
            return mContext.getString(R.string.tab4);}
    }
}