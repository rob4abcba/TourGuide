package example.android.tourguide;

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


       // String recived = getIntent().getExtras().getString("key");

       // TextView temp = findViewById(R.id.text_output);
       // temp.setText(recived);
    }
}
