package example.android.tourguide;

import android.graphics.Movie;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by james on 7/17/2018.
 */

public class Details extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.details);

        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("key");

        TextView mTextView = findViewById(R.id.text_output);
        mTextView.setText(message);

    }
}
