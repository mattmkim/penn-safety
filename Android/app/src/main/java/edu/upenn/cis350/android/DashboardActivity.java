package edu.upenn.cis350.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;

public class DashboardActivity extends AppCompatActivity {
    private static final String TAG = "MAIN";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void onPostNavButtonClick(View view) {
        // the intent connects the two classes
        Log.v(TAG, "called post");
        Intent i = new Intent(this, PostActivity.class);
        DashboardActivity.this.startActivity(i);
    }

    public void onMapButtonClick(View view) {
        Log.v(TAG, "called maps");
        Intent i = new Intent(this, MapsActivity.class);
        DashboardActivity.this.startActivity(i);
    }

    public void onProfileButtonClick(View view) {
        Log.v(TAG, "called profile");
        Intent i = new Intent(this, ProfileActivity.class);
        DashboardActivity.this.startActivity(i);
    }
}