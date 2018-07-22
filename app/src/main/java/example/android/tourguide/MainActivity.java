package example.android.tourguide;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.view.ViewPager;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        // find the view pager in the xml layout
        ViewPager mViewPager = findViewById(R.id.view_pager);
        // Create an adapter that knows which fragment should be shown on each page
        PageAdaptor SPAdaptor = new PageAdaptor(getSupportFragmentManager(), MainActivity.this);
        // link the object to the page viewer.
        mViewPager.setAdapter(SPAdaptor);
        // Find the tab layout that shows the tabs
        TabLayout tabLayout = findViewById(R.id.tabs);
        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(mViewPager);
    }
}