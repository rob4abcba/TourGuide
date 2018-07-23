package example.android.tourguide;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * Created by james on 7/17/2018.
 * built for the udacity tour guide app.
 */
public class Details extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("key");
        int message1 = bundle.getInt("text2");
        int message2 = bundle.getInt("text3");
        int message3 = bundle.getInt("text4");
        int message4 = bundle.getInt("text5");
        int message5 = bundle.getInt("text6");
        int message6 = bundle.getInt("text7");
        int message7 = bundle.getInt("text8");
        int message8 = bundle.getInt("text9");
        // set image and text views
        ImageView mImageView = findViewById(R.id.image_output);
        mImageView.setImageResource(message8);
        // name of the object
        TextView mTextView = findViewById(R.id.name_output);
        mTextView.setText(message);
        // first info box.
        TextView mInfoBox1 = findViewById(R.id.info_text_1);
        mInfoBox1.setText(message1);
        // remove view if it has no info show if they do.
        TextView mTitleTextBox2 = findViewById(R.id.title2);
        if (message2 == 0) {
            mTitleTextBox2.setVisibility(View.GONE);
        }else {
            mTitleTextBox2.setText(message2);
            mTitleTextBox2.setVisibility(View.VISIBLE);
        }
        TextView mInfoBox3 = findViewById(R.id.info_text_3);
        if (message3 == 0) {
            mInfoBox3.setVisibility(View.GONE);
        } else {
            mInfoBox3.setText(message3);
            mInfoBox3.setVisibility(View.VISIBLE);
        }
        TextView mTitleTextBox4 = findViewById(R.id.title4);
        if (message4 == 0) {
            mTitleTextBox4.setVisibility(View.GONE);
        }else {
            mTitleTextBox4.setText(message4);
            mTitleTextBox4.setVisibility(View.VISIBLE);
        }
        TextView mInfoBox5 = findViewById(R.id.info_text_5);
        if (message5 == 0) {
            mInfoBox5.setVisibility(View.GONE);
        }else {
            mInfoBox5.setText(message5);
            mInfoBox5.setVisibility(View.VISIBLE);
        }
        TextView mTitleTextBox6 = findViewById(R.id.title6);
        if (message6 == 0) {
            mTitleTextBox6.setVisibility(View.GONE);
        }else {
            mTitleTextBox6.setText(message6);
            mTitleTextBox6.setVisibility(View.VISIBLE);
        }
        TextView mInfoBox7 = findViewById(R.id.info_text_7);
        if (message7 == 0) {
            mInfoBox7.setVisibility(View.GONE);
        }else {
            mInfoBox7.setText(message7);
            mInfoBox7.setVisibility(View.VISIBLE);
        }
    }
}
